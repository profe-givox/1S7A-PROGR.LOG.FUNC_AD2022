package net.ivanvega.app

class PrintingFishAction(val food: String) : FishAction  {
    override fun eat() {
        println(food)
    }
}