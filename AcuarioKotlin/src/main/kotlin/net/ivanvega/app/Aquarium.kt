package net.ivanvega.app

open class Aquarium ( width: Int =20, heigth: Int = 40,  length: Int = 100 ) {
    open var width: Int = width
    open var heigth: Int = heigth
    open var length: Int = length

//    val volume: Int
//        get() = (width * heigth * length) / 1000

    open var volume: Int
        get() { return (width * heigth * length) / 1000 }
//        private set(value)
        set(value)
        {
            heigth = (value*1000) / (width*length)
        }

    open var shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.90

    init {
        println("Bloque de inicializacion")
        //volume = width*heigth*length
        printSize()
    }

    constructor(numeroDePeces: Int) : this() {
        val estanque = numeroDePeces * 2000 * 1.1
        println((estanque / (length*width)))
        heigth =  (estanque / (length*width)).toInt()
    }

    fun printSize(){
        println("Ancho: $width, " + "alto: $heigth, " + "largo:  $length " )
        println("Volume: $volume lts" )
        println("Volume: $volume l, Water: l ${water/volume*100.00} full")
    }
}

fun construirAquario(){
    val miAcuario = Aquarium()
    miAcuario.printSize()
    println("-----------------------------")

    miAcuario.heigth = 70
    miAcuario.printSize()

    println("-----------------------------")
    //miAcuario.volume =  90000
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

    println("-----------------------------")
    val aq6 = Aquarium( 29  )
    aq6.printSize()
    //aq6.volume = 70
    aq6.printSize()

    println("-----------------------------")
    val aq7 = Aquarium( 25 , 25, 40 )
    aq7.printSize()
    println(aq7.shape)





}

fun main(){
    construirAquario()
}