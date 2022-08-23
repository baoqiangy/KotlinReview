package slides77_78.noimpl

class Water: Drinkable {
    override val drinkName = javaClass.name.split(".").last()
    override fun taste() {
        println("$drinkName tastes bland")
    }
}

