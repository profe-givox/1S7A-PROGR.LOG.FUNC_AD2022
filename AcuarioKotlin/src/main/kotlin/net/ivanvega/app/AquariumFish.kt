package net.ivanvega.app

import com.sun.deploy.config.Config

abstract class AquariumFish {
    abstract val color : String
}


fun makeFish(){
    val shark = Shark();
    println("Shark color: ${shark.color}")
    shark.eat()

    val plecus = Plecostumes(
        object : FishColor {
            override val color: String
                get() = "verde"

        }
    )
    println("Plecus 1 color: ${plecus.color}")
    plecus.eat()

    val plecus2 = Plecostumes(
        object : FishColor {
            override val color: String
                get() = "verde"

        }
    )
    println("Plecus 2 color: ${plecus.color}")
    plecus.eat()

}

fun main(){
    makeFish()
}