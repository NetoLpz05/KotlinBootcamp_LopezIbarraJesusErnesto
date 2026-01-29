package TestSpices

fun main() {
    val spice = SimpleSpice()
    println("Spice name: ${spice.name}")
    println("Spice heat: ${spice.heat}")

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("chili", "very spicy"),
        makeSalt()
    )

    //Lista de especias picantes o menos (heat <= 10)
    val spicyOrLess = spices.filter { it.heat <= 10 }

    println("Especias picantes o menos:")
    spicyOrLess.forEach {
        println("${it.nombre} - heat ${it.heat}")
    }
}