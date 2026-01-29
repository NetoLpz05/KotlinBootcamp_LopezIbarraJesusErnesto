package Aquarium

class Aquarium (var length: Int = 20, var width: Int = 40, var height: Int = 100){

    var volume: Int
        get() = length * width * height / 1000
        set(value) {
            height = (value * 1000) / (length * width)
        }

    var water = volume * 0.9

    constructor(numberOfFish: Int) : this() {
        val water : Int =  numberOfFish * 2000
        val tank : Double = water + water * 0.1
        height = (tank / (length*width)).toInt()
    }
}