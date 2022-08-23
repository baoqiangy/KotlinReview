package slides63_65

fun main() {
    val fruit:Fruit = Fruit()
    val dragonFruit:DragonFruit = DragonFruit()
    getObjectInfo(fruit)
    getObjectInfo(dragonFruit)
}

private fun getObjectInfo(any:Any){
    if(any is DragonFruit) {
        println((any as DragonFruit).description())
    }else{
        println("Not DragonFruit")
    }
}

