package br.com.jrdani.jaco.model.vendor

data class VendorBook (
    val abbrev: Map<String, String>,
    val name: String,
    val author: String,
    val group: String,
    val version: String
)
