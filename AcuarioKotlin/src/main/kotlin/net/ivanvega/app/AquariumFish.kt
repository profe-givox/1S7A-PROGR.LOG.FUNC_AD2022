package net.ivanvega.app

abstract class AquariumFish {
    abstract val color : String
}

fun makeFish(){
    val shark = Shark();
    println("Shark color: ${shark.color}")

    val plecus = Plecostumes()
    println("Plecus color: ${plecus.color}")


}

fun main(){
    makeFish()
}