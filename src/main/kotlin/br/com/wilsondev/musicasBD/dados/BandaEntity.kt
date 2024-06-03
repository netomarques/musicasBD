package br.com.wilsondev.musicasBD.dados

import javax.persistence.*

@Entity
@Table(name  = "banda")
class BandaEntity(
    val nome: String = "Nome da banda",
    val descricao: String = "Descrição da banda",
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0) {
}