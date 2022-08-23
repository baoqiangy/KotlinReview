package slides77_78.withdefault

interface Edible {
    val name:String
        get() = "Food"

    fun howToEat(){
        println("Peel $name, chew, then swallow")
    }
}

