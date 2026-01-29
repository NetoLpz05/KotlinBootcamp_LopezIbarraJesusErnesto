package Aquarium2

fun main(args: Array<String>) {
    fishExamples()
}

data class Fish(val name: String)

fun fishExamples() {
    val fish = Fish("splashy")

    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })

    fish.name.capitalize()
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}