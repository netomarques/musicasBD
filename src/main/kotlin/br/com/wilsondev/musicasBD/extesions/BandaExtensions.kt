package br.com.wilsondev.musicasBD.extesions

import br.com.wilsondev.musicasBD.dados.BandaEntity
import br.com.wilsondev.musicasBD.modelo.Banda

fun Banda.toEntity(): BandaEntity {
    return BandaEntity(this.nome, this.descricao, this.id)
}

fun BandaEntity.toModel(): Banda {
    return Banda(this.nome, this.descricao, this.id)
}