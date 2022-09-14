package net.ivanvega.app.modelo

data class Decoration (val rocks : String) {

}

fun makeDecoration(){
    val decoration = Decoration("Granite")
    println(decoration)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration == decoration2)
    println(decoration2 == decoration3)
}

fun main (){
    makeDecoration()
}
