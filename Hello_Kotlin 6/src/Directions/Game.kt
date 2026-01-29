package Directions


class Game {

    var path = mutableListOf(Directions.START)

    val north = {
        path.add(Directions.NORTH)
    }

    val south = {
        path.add(Directions.SOUTH)
    }

    val east = {
        path.add(Directions.EAST)
    }

    val west = {
        path.add(Directions.WEST)
    }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean): Boolean {
        return where()
    }

    fun makeMove(command: String?) {
        when (command) {
            "w" -> move(north)
            "s" -> move(south)
            "a" -> move(east)
            "d" -> move(west)
            else -> move(end)
        }
    }
}