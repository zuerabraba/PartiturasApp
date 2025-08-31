package com.associacao.partiturasapp

data class Partitura(
    var id: String? = "",
    var titulo: String = "",
    var compositor: String = "",
    var instrumento: String = "",
    var arquivoUrl: String = ""
)
