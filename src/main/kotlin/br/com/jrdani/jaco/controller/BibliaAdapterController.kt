package br.com.jrdani.jaco.controller

import br.com.jrdani.jaco.model.BibliaVersiculoResponse
import br.com.jrdani.jaco.model.enums.Livro
import br.com.jrdani.jaco.model.vendor.VendorVerse
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.client.RestTemplate

@Controller
@RequestMapping("/biblia")
class BibliaAdapterController(
    private val restTemplate: RestTemplate
) {

    //TODO: Cache Results with Redis
    @GetMapping("/{book}/{chapter}/{number}")
    fun getVersiculo(
        @PathVariable book: Livro,
        @PathVariable chapter: Int,
        @PathVariable number: Int
    ): ResponseEntity<BibliaVersiculoResponse> {
        val uri =  "/verses/nvi/${book.abbrev}/${chapter}/${number}"
        val vendorResponse = restTemplate.getForObject(uri, VendorVerse::class.java)!!

        return ResponseEntity.ok(
            BibliaVersiculoResponse.fromVendorModel(vendorResponse))
    }

    @GetMapping("/{book}/{chapter}/verses")
    fun getMultiplosVersiculos(
        @PathVariable book: Livro,
        @PathVariable chapter: Int,
        @RequestParam numbers: List<Int>
    ): ResponseEntity<List<BibliaVersiculoResponse>> {
        val response = numbers.map { number ->
            val uri =  "/verses/nvi/${book.abbrev}/${chapter}/${number}}"
            val vendorResponse = restTemplate.getForObject(uri, VendorVerse::class.java)!!
            BibliaVersiculoResponse.fromVendorModel(vendorResponse)
        }

        return ResponseEntity.ok(response)
    }
}
