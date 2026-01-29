package ListQuiz

fun List<Int>.filterByOperation(operation: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (operation(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)

    val divisibleBy3 = numbers.filterByOperation { it % 3 }

    println(divisibleBy3)
}
