package Spices

class Curry(
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice("Curry", spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Moliendo el curry en polvo")
    }
}
