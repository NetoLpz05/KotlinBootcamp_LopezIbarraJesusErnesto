package Libros

open class Book(
    val title: String,
    val author: String
) {

    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
        println("Leyendo página $currentPage de $title")
    }
}
