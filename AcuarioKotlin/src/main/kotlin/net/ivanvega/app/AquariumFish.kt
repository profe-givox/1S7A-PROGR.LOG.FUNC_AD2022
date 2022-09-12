package net.ivanvega.app

abstract class AquariumFish {
    abstract val color : String
}

fun makeFish(){
    val shark = Shark();
    println("Shark color: ${shark.color}")
    shark.eat()

    val plecus = Plecostumes()
    println("Plecus color: ${plecus.color}")
    plecus.eat()
}

fun main(){
    makeFish()
}