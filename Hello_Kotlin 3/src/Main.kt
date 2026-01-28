import java.util.Calendar

fun main1() {
    //Quiz 3.3
    dayOfWeek()
    dayOfWeek2()
}

/*
 * Quiz 3.3
 */
fun dayOfWeek() {
    println("What day is it today?")
}

fun dayOfWeek2() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

fun main2(args: Array<String>) = println(if ((args.getOrNull(0)?.toInt() ?: 0) < 12) "Good morning, Kotlin" else "Good night, Kotlin")

//Quiz 3.7
fun main3() {

    val fortune = getFortuneCookie()
    println("Your fortune is: $fortune")
}

fun getFortuneCookie(): String {

    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")

    val birthday = readLine()?.toIntOrNull() ?: 1

    val index = birthday % fortunes.size

    return fortunes[index]
}

//Quiz 3.9
fun main4() {

    val birthday = getBirthday()
    val fortune = getFortune(birthday)

    println("Your fortune is: $fortune")
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {

    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when {
        birthday == 28 || birthday == 31 ->
            "Tendrás un día de mucha suerte!"

        birthday in 1..7 ->
            "Una gran semana empieza con un gran día!"

        else ->
            fortunes[birthday % fortunes.size]
    }
}

//Ejercicio 3.11
fun main5() {

    val tankSize = 10
    val currentFish = listOf(2, 2, 2)
    val canAddFish = fitMoreFish(tankSize, currentFish)

    println("¿Se puede agregar otro pez? $canAddFish")
}

fun fitMoreFish(tankSize: Int, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {

    val maxCapacity = if (hasDecorations) {
        tankSize * 0.8
    } else {
        tankSize * 1.0
    }

    val currentFishSize = currentFish.sum()
    val totalFishSize = currentFishSize + fishSize

    return totalFishSize <= maxCapacity
}

//Quiz 3.13
//fun main6() {
//
//    println(whatShouldIDoToday("happy"))
//    println(whatShouldIDoToday("sad"))
//    println(whatShouldIDoToday("happy", "rainy"))
//    println(whatShouldIDoToday("happy", "sunny", 30))
//}
//
//fun whatShouldIDoToday(
//    mood: String,
//    weather: String = "sunny",
//    temperature: Int = 24
//): String {
//
//    return when {
//        mood == "happy" && weather == "sunny" && temperature > 25 ->
//            "ir a nadar"
//
//        mood == "happy" && weather == "sunny" ->
//            "salir a caminar"
//
//        mood == "sad" && weather == "rainy" ->
//            "quedarte en casa viendo una película"
//
//        temperature < 10 ->
//            "tomar algo caliente y descansar"
//
//        else ->
//            "quedarte en casa y leer"
//    }
//}

//Quiz 3.15
fun main7() {

    print("¿Cómo te sientes hoy? ")
    val mood = readLine()!!

    println(whatShouldIDoToday(mood))
}

fun isHappySunnyWarm(mood: String, weather: String, temperature: Int) =
    mood == "happy" && weather == "sunny" && temperature > 25

fun isSadRainyFreezing(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isVeryHot(temperature: Int) =
    temperature > 35

fun isCold(temperature: Int) =
    temperature < 10


fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String =
    when {
        isHappySunnyWarm(mood, weather, temperature) ->
            "salir a caminar"

        isSadRainyFreezing(mood, weather, temperature) ->
            "quedarte en la cama"

        isVeryHot(temperature) ->
            "ir a nadar"

        isCold(temperature) ->
            "tomar algo caliente y descansar"

        else ->
            "quedarte en casa y leer"
    }

//Quiz 3.17
fun main8() {

    val spices = listOf(
        "curry",
        "pepper",
        "cayenne",
        "ginger",
        "red curry",
        "green curry",
        "red pepper"
    )

    //Obtener todos los currys y ordenarlos por longitud
    val curriesSortedByLength = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }

    println("Curries ordenados por longitud")
    println(curriesSortedByLength)

    //Especias que empiezan con 'c' y terminan con 'e'
    val startsWithCEndsWithE_1 = spices
        .filter { it.startsWith("c") && it.endsWith("e") }

    println("\nEmpiezan con 'c' y terminan con 'e'")
    println(startsWithCEndsWithE_1)

    //Especias que empiezan con 'c' y terminan con 'e'
    val startsWithCEndsWithE_2 = spices
        .filter { spice ->
            spice.first() == 'c' && spice.last() == 'e'
        }

    println("\nEmpiezan con 'c' y terminan con 'e'")
    println(startsWithCEndsWithE_2)

    //Tomar los primeros 3 elementos y devolver los que empiezan con 'c'
    val firstThreeStartingWithC = spices
        .take(3)
        .filter { it.startsWith("c") }

    println("\nPrimeros 3 que empiezan con 'c'")
    println(firstThreeStartingWithC)
}

//Quiz 3.19
fun main9() {

    //Ejercicio 3.19.1
    //Dado de 12 caras
    val rollDice = { (1..12).random() }
    println("Dado de 12 caras: ${rollDice()}")

    //Lambda que recibe el número de caras
    val rollDiceWithSides = { sides: Int ->
        if (sides == 0) 0 else (1..sides).random()
    }

    println("Dado de 6 caras: ${rollDiceWithSides(6)}")
    println("Dado de 0 caras: ${rollDiceWithSides(0)}")

    //Lambda usando notación de tipo de función
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }
}

fun main() {

    //Ejercicio 3.19.2
    //Lambda usando notación de tipo de función
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }

    gamePlay(rollDice2)
    gamePlay(rollDice2)
    gamePlay(rollDice2)
}

fun gamePlay(roll: (Int) -> Int) {
    val diceRoll = roll(12)
    println("Resultado del dado: $diceRoll")
}

