package slides77_78.noimpl

class AppleJuice: Drinkable {
    override val drinkName = javaClass.name.split(".").last()
    override fun taste() {
        println("$drinkName tastes sweet.")
    }
}

