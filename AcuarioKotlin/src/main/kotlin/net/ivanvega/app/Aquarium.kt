package net.ivanvega.app

class Aquarium {
    var width: Int =20
    var heigth: Int = 40
    var length: Int = 100
    var volume: Int = 0
    init {
        volume = width*heigth*length
    }

    fun printSize(){
        println("Ancho: $width, " + "alto: $heigth, " + "largo:  $length " )
        println("Volume: $volume " )
    }
}

fun construirAquario(){
    val miAcuario = Aquarium()
    miAcuario.printSize()
    println("-----------------------------")

    miAcuario.heigth = 70
    miAcuario.printSize()

    println("-----------------------------")
    miAcuario.volume =  90000
    miAcuario.printSize()
}

fun main(){
    construirAquario()
}