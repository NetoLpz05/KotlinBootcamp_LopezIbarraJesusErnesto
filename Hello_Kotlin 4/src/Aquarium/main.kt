package Aquarium

fun main1(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length is ${myAquarium.length}, " + "Width is ${myAquarium.width}, " + "Height is ${myAquarium.height}")

    myAquarium.height = 80

    println("Height is ${myAquarium.height} cm")
    println("Volume is ${myAquarium.volume} cm")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium's volume is ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with: " + "length: ${myAquarium2.length}" + "width: ${myAquarium2.width}" + "height: ${myAquarium2.height}")
}

fun feedFish(fish: FishAction){
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark's color is ${shark.color} \n Plecostomus is ${pleco.color}")
    shark.eat()
    pleco.eat()
}

fun main (args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat a lot of algae"),
    FishColor by fishColor

