package slides63_65

class DragonFruit:Fruit() {
    override var name:String = "DragonFruit"
    public override fun howToEat(){
        println("Peel, cut, chew and swallow it.")
    }
    public fun description() = "${this.name} is a ${super.name}? ${this is Fruit}"
}

