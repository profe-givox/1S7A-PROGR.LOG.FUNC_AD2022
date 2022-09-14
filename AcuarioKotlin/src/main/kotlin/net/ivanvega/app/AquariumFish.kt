package net.ivanvega.app

import com.sun.deploy.config.Config

abstract class AquariumFish {
    abstract val color : String
}


fun makeFish(){
    val shark = Shark();
    println("Shark color: ${shark.color}")
    shark.eat()

    val plecus = Plecostumes()
    println("Plecus 1 color: ${plecus.color}")
    plecus.eat()

    val otroColor =  object:FishColor{
        override val color: String
            get() = "Verde"

    }

    val plecus2 = Plecostumes(otroColor)
    println("Plecus 2 color: ${plecus2.color}")
    plecus2.eat()

}

fun main(){
    makeFish()
}