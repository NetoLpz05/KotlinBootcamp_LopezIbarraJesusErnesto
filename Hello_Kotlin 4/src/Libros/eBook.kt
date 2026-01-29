package Libros

class eBook(
    title: String,
    author: String,
    val format: String = "text"
) : Book(title, author) {

    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
        println("Leyendo eBook \"$title\" | Palabras leídas: $wordCount")
    }
}
