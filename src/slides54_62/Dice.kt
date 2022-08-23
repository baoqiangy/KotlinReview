package slides54_62

class Dice {
    val rolledValue
        get() = (1..6).shuffled().first()
}

fun main() {
    val dice = Dice()
    repeat(6){
        println(dice.rolledValue)
    }
}