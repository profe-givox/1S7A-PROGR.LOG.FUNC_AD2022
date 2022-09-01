import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    feedTheFish()
    swim()
    swim("slow")
    swim(speed = "turtle-like")

    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    println(updateDirty(30, waterFilter ))
    println(updateDirty(30, { dirty: Int -> dirty * 3 } ))
    println(updateDirty(16, ::incrementDirty ))


    println(updateDirty(30) { dirty: Int -> dirty + 23 })

    val lista = listOf("lunes", "martes", "miercoles", "jueves", "viernes")

    lista.forEach(::println)
    lista.forEach { println(it)
    }

//    val diasConM = lista.filter { it[0] == 'm' }
    val diasConM = lista.filter( {el ->  el[0] == 'm'} )
    println(diasConM)

    val filtroPlaneado =  lista.asSequence().filter { it[0] == 'm' }
    println(filtroPlaneado)

    val listaNueva = filtroPlaneado.toList()
    println(lista)


    val lazyMap = lista.asSequence().map {
       println(" access " + it)
        "¡" +  it + "!"
    }

    println ("lazy: $lazyMap")
    println("--------")
    println("first: ${lazyMap.first()} " )
    println("--------")
    println("last: ${lazyMap.last()} " )

    println("--------")
    println("all: ${lazyMap.toList()} " )



}

fun incrementDirty(start : Int)  = start + 1

fun updateDirty (dirty: Int, operacion : (Int) -> Int ) : Int {
    return operacion(dirty)
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day : String) : String{
    return when(day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun swim(speed : String = "fast"){
    println("swimming $speed")
}

/*fun shouldChangeWater(day : String, temperature : Int = 22, dirty : Int = 20) : Boolean{
    return when{
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}*/

//fun shouldChangeWater(day : String, temperature : Int = 22, dirty : Int = 20) : Boolean{
//    return when{
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) -> true
//        else -> false
//    }
//}

fun shouldChangeWater(day : String, temperature : Int = 22, dirty : Int = getSensorDirtyReading()) : Boolean{
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun getSensorDirtyReading() = 20

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"