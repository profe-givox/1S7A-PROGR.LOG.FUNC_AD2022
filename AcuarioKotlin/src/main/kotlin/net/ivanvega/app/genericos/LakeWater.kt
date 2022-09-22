package net.ivanvega.app.genericos

class LakeWater: WaterSupply(true) {
    fun filter(){
        needProcessing = false
    }
}