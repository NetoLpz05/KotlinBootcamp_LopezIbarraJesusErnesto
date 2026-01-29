package Aquarium

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun cleanFish()
    fun swim(){
        println("swim")
    }
}

class Shark: AquariumFish(), FishAction{
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}


abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}


//object GoldColor: FishColor {
//    override val color = "gold"
//}
//
//object RedColor: FishColor {
//    override val color = "red"
//}
//
//Class PrintingFishAction(val food: String) : FishAction{
//    override fun eat(){
//        println(food)
//    }
//}