package Spices

class Curry(
    spiciness: String,
    spiceColor: SpiceColor = YellowSpiceColor
) : Spice("Curry", spiciness, spiceColor), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo curry")
    }
}
