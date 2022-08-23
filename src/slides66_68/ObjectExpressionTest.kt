package slides66_68

fun main() {
    val rottenFruit = object : Fruit() {
        override var name:String = "Rotten Fruit"
        init {
            println("Rotten Fruit Initialized")
        }
        public override fun howToEat() {
            println("Rotten fruit is bad to eat.")
        }
    }
    println(rottenFruit is Fruit)
    println(rottenFruit.name)
    rottenFruit.howToEat()
}