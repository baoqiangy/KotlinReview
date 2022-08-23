package slides69

open class Fruit (){
    private class FruitProcessor(var fruit:Fruit){
        fun processFruit(){
            println("Processing ${fruit.name}")
        }
    }

    open var name:String = "Fruit"
    private var fruitProcessor = FruitProcessor(this)

    open fun howToEat(){
        println("By default, bite, chew and swallow it.")
        println("You can process it first as well:")
        fruitProcessor.processFruit()
    }

    companion object {
        var storeName:String = "GuoYuan"
        var saleAmount:Double = 0.00
        init {
            println("Companion Object of Fruit Initialized.")
        }
        fun sell(fruit:Fruit, amount:Double){
            saleAmount += amount
            println("Selling $$amount of ${fruit.name }")
        }
    }

}


