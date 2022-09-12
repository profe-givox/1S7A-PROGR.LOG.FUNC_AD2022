package net.ivanvega.app

class Shark : FishColor, FishAction  {
    override val color: String
        get() = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }

}