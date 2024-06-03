package br.com.wilsondev.musicasBD.principal

import br.com.wilsondev.musicasBD.dados.AlbumDAO
import br.com.wilsondev.musicasBD.dados.Banco
import br.com.wilsondev.musicasBD.dados.BandaDAO
import br.com.wilsondev.musicasBD.modelo.Album
import br.com.wilsondev.musicasBD.modelo.Banda

fun main() {

    val manager = Banco.getEntityManager()
    val bandaDAO = BandaDAO(manager)
    val albumDAO = AlbumDAO(manager)

//    val titas = Banda("Titãs")
//    bandaDAO.adicionar(titas)
    val bandaTitas = bandaDAO.getById(1)

    val goBack = Album("Go Back", bandaTitas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", bandaTitas)

    albumDAO.adicionar(goBack)
    albumDAO.adicionar(cabecaDinossauro)

    val listaAlbum = albumDAO.getLista()

    println(listaAlbum)

    manager.close()
 }