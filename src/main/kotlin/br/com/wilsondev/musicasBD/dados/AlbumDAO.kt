package br.com.wilsondev.musicasBD.dados

import br.com.wilsondev.musicasBD.extesions.toEntity
import br.com.wilsondev.musicasBD.extesions.toModel
import br.com.wilsondev.musicasBD.modelo.Album
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager): DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java) {

    override fun toEntity(objeto: Album): AlbumEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }
}