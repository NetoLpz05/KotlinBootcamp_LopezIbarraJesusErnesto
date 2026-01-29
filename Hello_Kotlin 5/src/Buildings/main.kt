package Buildings

fun main() {
//    val woodBuilding = Building(Wood())
//    woodBuilding.build()

    val woodBuilding = Building(Wood())
    woodBuilding.build()
    isSmallBuilding(woodBuilding)

    val brickBuilding = Building(Brick())
    brickBuilding.build()
    isSmallBuilding(brickBuilding)
}