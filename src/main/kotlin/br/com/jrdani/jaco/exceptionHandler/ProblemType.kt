package br.com.jrdani.jaco.exceptionHandler

enum class ProblemType(val description: String) {
    VENDOR_API_FORBIDDEN_ACCESS("Third Party API Error: token was expired."),
    VENDOR_API_NOT_FOUND("Third Party API Error: Resource not found."),
    VENDOR_API_GENERAL("Third Party API is temporary unavailable.");
}
