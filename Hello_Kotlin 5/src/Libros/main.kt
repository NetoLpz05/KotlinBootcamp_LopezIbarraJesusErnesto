package Libros

fun main() {

    //val book = Book("Cien años de soledad", "Gabriel García Márquez", 1967)

    //val (title, author) = book.getTitleAuthor()
    //val (t, a, y) = book.getTitleAuthorYear()

    //rintln("Aquí está tu libro \"$t\" escrito por $a en $y.")

    val allBooks = setOf(
        "Hamlet",
        "Macbeth",
        "Romeo and Juliet",
        "Othello"
    )

    val library = mapOf(
        "William Shakespeare" to allBooks
    )

    val hasHamlet = library.any { entry ->
        entry.value.contains("Hamlet")
    }

    println("¿La biblioteca contiene Hamlet? $hasHamlet")

    val moreBooks = mutableMapOf(
        "The Hobbit" to "J.R.R. Tolkien"
    )

    val author = moreBooks.getOrPut("Hamlet") {
        "William Shakespeare"
    }

    println("Autor de Hamlet: $author")
    println("Contenido final de moreBooks:")
    println(moreBooks)

    val book = Book("Kotlin in Action", "Dmitry Jemerov")

    val borrowedBooks = 3
    println("¿Puede pedir otro libro? ${book.canBorrow(borrowedBooks)}")

    book.printUrl()
}
