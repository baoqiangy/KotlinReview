package slides38_41

import kotlin.math.roundToInt

fun main() {
    val fullName = "John Edwards"
    println(fullName.substring(fullName.indexOf('E'), fullName.indexOf('s')))
    println(fullName.split(" "))

    //Destructuring
    val (firstName, lastName) = fullName.split(" ")
    println(firstName)
    println(lastName)

    val greetings1 = "Hello World!"
    println(greetings1.replace("o", "[new]"))
    println(greetings1.replace(Regex("o."), "[new]"))
    //Strings are immutable
    println(greetings1)

    val greetings2 = String(greetings1.toCharArray())
    println("Comparing strings:")
    println(greetings2)
    println(greetings1 == greetings2)
    println(greetings1 === greetings2)  //false

    val greetings3 = greetings1.substring(0, greetings1.length)
    println("Interned (same) strings:")
    println(greetings3)
    println(greetings1 == greetings3)
    println(greetings1 === greetings3)  //true

    //String to Numbers
    val a:Int = "5.98".toIntOrNull() ?: 0
    println(a)
    //TODO - try toFloat, toDouble, toInt, toLong, toBigDecimal

}