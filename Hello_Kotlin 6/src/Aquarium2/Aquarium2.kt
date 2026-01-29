package Aquarium2

data class Fish(var name: String)

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    myWith(fish.name) {
        println(replaceFirstChar { it.uppercase() })
    }

    println(fish.run { name })

    println(fish.apply { })

    val fish2 = Fish("splashy2").apply {
        name = "Sharky"
    }
    println(fish2)

    val result = fish.let { it.name.replaceFirstChar { c -> c.uppercase() } }
        .let { it + " fish" }
        .let { it + it.length }
        .let { it + 31 }

    println(result)
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}