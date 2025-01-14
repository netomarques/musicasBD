package br.com.wilsondev.musicasBD.extesions

import br.com.wilsondev.musicasBD.dados.AlbumEntity
import br.com.wilsondev.musicasBD.modelo.Album

fun Album.toEntity(): AlbumEntity {
    return AlbumEntity(this.titulo, this.banda.toEntity(),this.id)
}

fun AlbumEntity.toModel(): Album {
    return Album(this.titulo, this.banda.toModel(), this.id)
}