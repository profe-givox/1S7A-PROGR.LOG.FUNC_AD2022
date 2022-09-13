package net.ivanvega.app

//class Plecostumes : AquariumFish(), FishAction {
//class Plecostumes : FishAction, FishColor by GoldColor  {
class Plecostumes (fishColor: FishColor = GoldColor) : FishAction, FishColor by  fishColor  {
//    override val color: String = GoldColor.color
    override fun eat() {
        println("Eat algae")
    }

}