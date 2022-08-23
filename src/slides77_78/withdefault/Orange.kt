package slides77_78.withdefault

class Orange:Edible {
    override val name: String
        get() = javaClass.name.split(".").last()
}

