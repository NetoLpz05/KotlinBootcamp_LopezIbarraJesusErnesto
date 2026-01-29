package Libros

fun main() {
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

    //val book = Book("Kotlin in Action", "Dmitry Jemerov")

//    val borrowedBooks = 3
//    println("¿Puede pedir otro libro? ${book.canBorrow(borrowedBooks)}")
//
//    book.printUrl()

    val book = Book(100)
    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Pages left: ${book.pages}")
        println("Book weight: ${book.weight()} grams\n")
    }

    println("The book has no pages left :(")
}