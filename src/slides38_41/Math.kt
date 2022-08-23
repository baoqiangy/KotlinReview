package slides38_41

import kotlin.math.roundToInt

fun main() {
    //Integer division
    println(6/4)
    //Double result
    println(6/4.00)
    println("Result of dividing 7 by 3.00 is ${"%.3f".format(7/3.00)}")
    //toInt does truncation
    println((7/2.00).toInt())
    //roundToInt does rounding
    println((7/2.00).roundToInt())
}