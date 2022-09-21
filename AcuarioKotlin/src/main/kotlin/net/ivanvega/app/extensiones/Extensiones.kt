package net.ivanvega.app.extensiones

open class AquariumPlant (val color: String, private val size: Int)
class GreenLeafyPlant(size: Int) : AquariumPlant ("green", size)

fun AquariumPlant.isRed() =  color == "red"
//fun AquariumPlant.isBig = size > 50

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() =  println("GreenLeafyPlant")

fun main(){

    val aqp1 = AquariumPlant("Verde", 20);
    println(aqp1.color)
    println("El color ${aqp1.color} es rojo? "
            + aqp1.isRed() )

    val plant = GreenLeafyPlant(20)
    plant.print()
    println("\n")

    val plantAquarium : AquariumPlant = plant
    plantAquarium.print()
}