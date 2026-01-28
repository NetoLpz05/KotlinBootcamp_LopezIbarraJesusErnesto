fun main() {
    val fish = 2
    val result = fish.times(6)
    val result2 = fish.div(10)
    val result3 = fish.plus(3)
    val result4 = fish.minus(3)

    println("Multiplicación " + result)
    println("División " + result2)
    println("Suma " + result3)
    println("Resta " + result4)

    /*
     * Quiz 2.4
     */
    //No se puede esta línea porque directamente se bloquea el null
    //val address : String = null

    val amount : Double? = 10.0

    println(amount)

    var list: List<String?>? = listOf(null, null)

    println(list)

    println(list?.size)

    /*
     * Práctica de Operaciones básicas en Kotlin (Quiz 2.6)
     */
    //Ejercicio 1
    val Resultado = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    println(Resultado)

    //Ejercicio 2
    var rainbowColor = "red"
    rainbowColor = "blue"
    val blackColor = "black"
    //Esta línea no se puede porque ya se le dió el valor directamente, no es una variable
    //blackColor = "white"

    //Ejercicio 3
    var greenColor = null
    var blueColor: Int? = null

    //Ejercicio 4
    listOf(null,null)
    val list2: List<String?> = listOf(null, null)
    val list3: List<String?>? = null

    println(list)
    println(list2)
    //Esta no se imprimirá porque es null
    //println(list3)

    //Ejercicio 5
    val nullTest: Int? = null
    println(nullTest?.inc() ?: 0)

    /*
     * Quiz 2.9
     */
    //Ejercicio 1
    val trout = "trout"
    val haddock = "haddock"
    val snapper = "snapper"

    println("Me gusta comer $trout y $snapper, pero no soy muy fan del $haddock")

    //Ejercicio 2
    val fishName = "Salmón"

    when (fishName.length) {
        0 -> println("Error: el nombre del pez no puede estar vacío")
        in 3..12 -> println("Buen nombre para un pez")
        else -> println("Nombre de pez aceptable")
    }

    /*
     * Quiz 2.12
     */
    val numbers = arrayOf(11, 12, 13, 14, 15)
    val stringList: MutableList<String> = mutableListOf()

    for (num in numbers) {
        stringList.add(num.toString())
    }

    println(stringList)
}

