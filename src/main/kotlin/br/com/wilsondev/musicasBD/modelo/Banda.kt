package br.com.wilsondev.musicasBD.modelo

class Banda(
    val nome: String = "Nome da Banda",
    val descricao: String = "Descricao da banda",
    val id: Int = 0) {

    override fun toString(): String {
        return "$nome ($id)"
    }
}