package net.ivanvega.app.modelo

data class Decoration (val rocks : String, val color: Color = Color.GREEN) {
}

data class Decoration2 (val rocks : String, val wood: String, val diver: String ) {

}

enum class Color (val rgb : Int){
    RED(0xFF0000), GREEN(0X00FF00), BLUE(0x0000FF)
}

fun makeDecoration(){
    val decoration = Decoration("Granite")
    println(decoration)
    println(decoration.color.ordinal)

    val decoration2 = Decoration("Slate")
    println(decoration2)

    val decoration3 = Decoration("Slate")
    println(decoration2)

    println(decoration.equals(decoration2))
    println(decoration2.equals(decoration3))

    println(decoration == decoration2)
    println(decoration2 == decoration3)

    println(decoration === decoration2)
    println(decoration2 === decoration3)

    val dec2 = Decoration2("roca", "madera", "buseador")
    println(dec2)

    val ( r, w, d) = dec2
    // val ( r, w, _) = dec2
    println(r)
    println(w)
    println(d)

    println(Color.BLUE.rgb)
    println(Color.BLUE.ordinal)
    println(Color.BLUE.name)

}

fun main (){
    makeDecoration()
}
