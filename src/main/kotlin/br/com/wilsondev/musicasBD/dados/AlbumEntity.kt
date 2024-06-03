package br.com.wilsondev.musicasBD.dados

import javax.persistence.*

@Entity
@Table(name = "album")
class AlbumEntity(
    val titulo: String = "Titulo do Album",
    @ManyToOne
    val banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
    )