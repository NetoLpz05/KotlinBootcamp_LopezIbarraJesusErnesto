package Buildings

class Building<out T : BaseBuildingMaterial>(private val material: T) {

    val baseMaterialsNeeded: Int = 100

    val actualMaterialsNeeded: Int =
        baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("${actualMaterialsNeeded} ${material::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}