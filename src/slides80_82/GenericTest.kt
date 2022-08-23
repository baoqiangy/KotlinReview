package slides80_82

fun main() {
    //Single type generics
    val fruitBox:Container<Fruit> = Container(DragonFruit(), DragonFruit())
    fruitBox.open()
    //operator function using []
    fruitBox[0]?.howToEat()
    val maleDog = MaleDog()
    maleDog.name = "Jerry"
    val petCage:Container<Dog> = Container(maleDog)
    petCage.open()
    (petCage[0] as? MaleDog)?.run {
        println("$name released")
        bark()
    }

    //multi type generics
    fruitBox.open()
    println(fruitBox.fetch(0) { Juice(it) })

}