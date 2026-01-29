package Libros

import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book) {
        val tornPages = Random.nextInt(1, 10)
        println("Puppy tears $tornPages pages")
        book.tornPages(tornPages)
    }

}