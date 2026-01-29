package TestSpices


class Spice(
    val nombre: String,
    val nivelPicante: String = "mild"
) {

    val heat: Int
        get() = when (nivelPicante.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    init {
        println("Especia creada: $nombre | Picante: $nivelPicante | Heat: $heat")
    }
}

fun makeSalt(): Spice {
    return Spice("salt", "mild")
}

