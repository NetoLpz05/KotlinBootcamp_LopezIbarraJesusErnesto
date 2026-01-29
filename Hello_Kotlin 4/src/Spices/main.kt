package Spices

fun main() {

    val curry = Curry("spicy")

    println("Nombre: ${curry.name}")
    println("Picante: ${curry.spiciness}")
    println("Heat: ${curry.heat}")
    println("Color: ${curry.color}")

    curry.prepareSpice()

    val curryMild = Curry("mild")
    val currySpicy = Curry("spicy")

    val container1 = SpiceContainer(curryMild)
    val container2 = SpiceContainer(currySpicy)

    println(container1.label)
    println(container2.label)
}