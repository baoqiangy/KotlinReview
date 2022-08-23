package slides80_82

class DragonFruit:Fruit() {
    override var name:String = "DragonFruit"
    override fun howToEat(){
        println("Peel, cut, chew and swallow it.")
    }
    fun description() = "${this.name} is a ${super.name}? ${this is Fruit}"
}

