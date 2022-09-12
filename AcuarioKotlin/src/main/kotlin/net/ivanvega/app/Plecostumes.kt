package net.ivanvega.app

//class Plecostumes : AquariumFish(), FishAction {
class Plecostumes : FishColor, FishAction {
    override val color: String = GoldColor.color
    override fun eat() {
        println("Eat algae")
    }

}