package Spices

sealed class Spice(
    val name: String,
    val spiciness: String = "mild",
    spiceColor: SpiceColor
) : SpiceColor by spiceColor {

    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            else -> 0
        }

    abstract fun prepareSpice()
}