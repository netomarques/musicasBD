package br.com.wilsondev.musicasBD.dados

import br.com.wilsondev.musicasBD.extesions.toEntity
import br.com.wilsondev.musicasBD.extesions.toModel
import br.com.wilsondev.musicasBD.modelo.Banda
import javax.persistence.EntityManager

class BandaDAO(manager: EntityManager): DAO<Banda, BandaEntity>(manager, BandaEntity::class.java) {

    override fun toEntity(objeto: Banda): BandaEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: BandaEntity): Banda {
        return entity.toModel()
    }
}