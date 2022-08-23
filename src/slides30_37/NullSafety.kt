package slides30_37

import java.lang.NullPointerException

fun main() {
    //? is required for nullable vars
    //TODO - try removing the ? mark
    var greetings:String? = null

    println(greetings?.count())
    //TODO - rewrite the above statement using let function

    //TODO - add exception handling for the following statement
    //println(greetings!!.count())

    mayReturnNull(1)?.let {
        println(it)
    }

    mayReturnNull(3)?.let {
        println(it)
    }

    //elvis operator ?:
    //action cannot be lambda
    //TODO - try putting println("null returned") in {}
    mayReturnNull(4)?.let { println(it) } ?: println("null returned")

    //TODO - add throw exception using elvis operator
    mayReturnNull(3)?.let {
        println(it)
    }
}

//Nullable return value (? required)
private fun mayReturnNull(i:Int):String?{
    var result = when(i){
        1 -> "Hello"
        2 -> "How are you?"
        else -> null
    }
    return result
}

class MyNullException():NullPointerException("Calling function on null value is not allowed.")
