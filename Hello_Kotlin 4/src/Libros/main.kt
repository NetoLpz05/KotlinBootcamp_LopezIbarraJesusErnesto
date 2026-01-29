package Libros

fun main() {

    val book = Book("1984", "George Orwell")
    book.readPage()
    book.readPage()

    println()

    val ebook = eBook("Clean Code", "Robert C. Martin")
    ebook.readPage()
    ebook.readPage()
}
