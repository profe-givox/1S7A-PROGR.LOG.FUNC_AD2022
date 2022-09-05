package net.ivanvega.app

class Aquarium ( width: Int =20, heigth: Int = 40,  length: Int = 100 ) {
    var width: Int = width
    var heigth: Int = heigth
    var length: Int = length
    var volume: Int = 0
    init {
        println("Bloque de inicializacion")
        volume = width*heigth*length
        printSize()
    }

    constructor(numeroDePeces: Int) : this() {
        val estanque = numeroDePeces * 2000 * 1.1
        println((estanque / (length*width)))
        heigth =  (estanque / (length*width)).toInt()
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

    println("-----------------------------")
    val aq2 = Aquarium(90, 110, 1000)
    aq2.printSize()

    println("-----------------------------")
    val aq3 = Aquarium(  heigth = 1000)
    aq3.printSize()

    println("-----------------------------")
    val aq4 = Aquarium(  )

    println("-----------------------------")
    val aq5 = Aquarium( numeroDePeces = 3  )
    aq5.printSize()
    println( aq5.heigth)

}

fun main(){
    construirAquario()
}