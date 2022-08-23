package slides77_78.withdefault

class Pizza:Edible {
    override val name: String
        get() = javaClass.name.split(".").last()

    override fun howToEat() {
        println("Cut $name, chew, then swallow")
    }
}

