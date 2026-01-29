package Spices

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}

interface Grinder {
    fun grind()
}
