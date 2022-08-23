package slides83_85

open class Food
open class FastFood:Food()
class Burger:FastFood()

class FoodStore : Production<Food> {
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}
class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood {
        println("Produce fast food")
        return FastFood()
    }
}
class BurgerStore : Production<Burger> {
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}

class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food")
    }
}
class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat fast food")
    }
}
class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat burger")
    }
}

fun main(args: Array<String>) {
    val foodStore1 : Production<Food> = FoodStore()
    val foodStore2 : Production<Food> = FastFoodStore()
    val foodStore3 : Production<Food> = BurgerStore()

//    val burgerStore1 : Production<Burger> = FoodStore()  // Error
//    val burgerStore2 : Production<Burger> = FastFoodStore()  // Error
//    val burgerStore3 : Production<Burger> = BurgerStore()

    val consumer1 : Consumer<Burger> = Everybody()
    val consumer2 : Consumer<Burger> = ModernPeople()
    val consumer3 : Consumer<Burger> = American()
    consumer1.consume(Burger())
    consumer2.consume(Burger())
    consumer3.consume(Burger())

//    val consumer4 : Consumer<Food> = Everybody()
//    val consumer5 : Consumer<Food> = ModernPeople() // Error
//    val consumer6 : Consumer<Food> = American()     // Error
    //consumer5.consume(Food())
}
