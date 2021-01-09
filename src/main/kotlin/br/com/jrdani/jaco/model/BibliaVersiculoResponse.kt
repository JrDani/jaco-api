package br.com.jrdani.jaco.model

import br.com.jrdani.jaco.model.enums.Livro
import br.com.jrdani.jaco.model.vendor.VendorVerse

data class BibliaVersiculoResponse (
    var book: Livro,
    val chapter: Int,
    val numbers: Int,
    val text: String
) {
    companion object {
        fun fromVendorModel(vendorVerse: VendorVerse): BibliaVersiculoResponse =
            BibliaVersiculoResponse(
                book = Livro.values().first { it.abbrev == vendorVerse.book.abbrev["pt"]},
                chapter = vendorVerse.chapter,
                numbers = vendorVerse.number,
                text = vendorVerse.text
            )
    }
}
