package br.com.wilsondev.musicasBD.dados

import javax.persistence.EntityManager

abstract class DAO<TModel, TEntity>(protected val manager: EntityManager, protected val entityType: Class<TEntity>) {

    abstract fun toEntity(objeto: TModel): TEntity
    abstract fun toModel(entity: TEntity): TModel

    open fun getLista(): List<TModel> {
        val query = manager.createQuery("FROM ${entityType.simpleName}",entityType)
        return query.resultList.map { entity -> toModel(entity) }
    }

    open fun adicionar(objeto: TModel) {
        val entity = toEntity(objeto)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }

    private fun getEntityById(id: Int): TEntity {
        val query = manager.createQuery("FROM ${entityType.simpleName} WHERE id = :id",entityType)
        query.setParameter("id", id)
        val entity = query.singleResult
        return entity
    }

    open fun getById(id: Int): TModel {
        val entity = getEntityById(id)
        return toModel(entity)
    }

    open fun deletar(id: Int) {
        val entity = getEntityById(id)
        manager.transaction.begin()
        manager.remove(entity)
        manager.transaction.commit()
    }
}