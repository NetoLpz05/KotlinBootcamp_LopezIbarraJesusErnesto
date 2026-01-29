package Libros

class Book(
    //val title: String,
    //val author: String,
    var pages: Int
) {

//    fun getTitleAuthor(): Pair<String, String> {
//        return Pair(title, author)
//    }

    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BORROWED_BOOKS
    }

//    fun printUrl() {
//        println("${BASE_URL}${title.replace(" ", "_")}.html")
//    }

    companion object {
        const val BASE_URL = "https://library.example.com/books/"
    }

    fun weight(): Double {
        return pages * 1.5
    }

    fun tornPages(torn: Int) {
        pages = (pages - torn).coerceAtLeast(0)
    }
}

const val MAX_BORROWED_BOOKS = 5