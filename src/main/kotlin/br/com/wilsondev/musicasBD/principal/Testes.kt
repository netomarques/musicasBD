package br.com.wilsondev.musicasBD.principal

import br.com.wilsondev.musicasBD.modelo.Album
import br.com.wilsondev.musicasBD.modelo.Banda

fun main() {

    val titas = Banda("Titãs")
    val goBack = Album("Go Back", titas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)

    println(titas)
    println(goBack)
    println(cabecaDinossauro)
 }