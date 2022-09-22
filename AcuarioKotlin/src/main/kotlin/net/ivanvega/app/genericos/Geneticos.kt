package net.ivanvega.app.genericos

open class WaterSupply (var needProcessing : Boolean )

class TapWater : WaterSupply (true){
    fun addChemicalCleanrs () {
        needProcessing = false
    }
}

//class Aquarium<T> (val waterSupply: T)
class Aquarium<T: WaterSupply> (val waterSupply: T){
    fun addWater(){
        check(!waterSupply.needProcessing) {"La agua necesita procesarse"}
        println("Agregando agua de ${waterSupply::class.simpleName}")
    }
}

fun main(){
    //val aq1 = Aquarium<TapWater>(TapWater())
    val aq1 = Aquarium(TapWater())
    println("El agua necesitA procesarse: ${aq1.waterSupply.needProcessing}" )
    aq1.waterSupply.addChemicalCleanrs()
    println("El agua necesitA procesarse: ${aq1.waterSupply.needProcessing}" )

//    val aq2 = Aquarium("CAenda")
//    println("El agua necesitA procesarse: ${aq2.waterSupply}" )
//    aq1.waterSupply.addChemicalCleanrs()
//    println("El agua necesitA procesarse: ${aq2.waterSupply}" )

    val aq3 = Aquarium(LakeWater())
    println("El agua necesitA procesarse: ${aq1.waterSupply.needProcessing}" )
    aq1.waterSupply.addChemicalCleanrs()
    println("El agua necesitA procesarse: ${aq1.waterSupply.needProcessing}" )

    val aq4 = Aquarium(TapWater())
    aq4.waterSupply.addChemicalCleanrs()
    aq4.addWater()
    println("El agua necesitA procesarse: ${aq4.waterSupply.needProcessing}" )
    aq1.waterSupply.addChemicalCleanrs()
    println("El agua necesitA procesarse: ${aq4.waterSupply.needProcessing}" )

}



