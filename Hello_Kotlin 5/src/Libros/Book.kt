package Libros

class Book(
    val title: String,
    val author: String,
    val year: Int
) {

    fun getTitleAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BORROWED_BOOKS
    }

    fun printUrl() {
        println("${BASE_URL}${title.replace(" ", "_")}.html")
    }

    companion object {
        const val BASE_URL = "https://library.example.com/books/"
    }
}

const val MAX_BORROWED_BOOKS = 5