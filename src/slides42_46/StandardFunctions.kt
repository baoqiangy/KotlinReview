package slides42_46

import java.io.File

fun main() {
    //1. apply – series of configuration, returns the receiver
    //TODO - convert the following code to apply (highlight then "alt+enter"->Convert to apply)
    println("Using apply function:")
    val menuFile = File("menu-file.txt")
    menuFile.setReadable(true)
    menuFile.setWritable(true)
    menuFile.setExecutable(true)

    //2. run - similar to apply but returns result instead of the receiver
    //TODO - convert the following code to run, check the difference (Hint: string is immutable)
    println("Using run function:")
    val str = "AABCAFGKIA"
    var result = str.replace('A', 'B').replace('C', 'D')

    println(result)

    //run with a function
    println(str.run(::replaceAWithB))

    //3. with – Similar to run, but in different syntax. 1st argument is the receiver.
    // It returns the result from lambda or function
    println("Using with function:")
    result = with(str){
        //default name of the receiver is "this"
        replaceAWithB(this)
    }
    println(result)

    result = with(str, ::replaceAWithB)
    println(result)

    //4. also - Similar to let, but returns the receiver instead of the result from lambda or function
    println("Using also function:")
    mayReturnNull(1)?.also {
        println(it)
    }?.also {
        println(it!!.replace('e', 'o'))
    }?.also {
        println(replaceEO(it!!))
    }?.also(::maskEOThenPrint)

    //5. takeIf & takeUnless – take a condition (predicate) and return either the receiver or null when
    // the condition is true (takeIf) or false (takeUnless)
    println("Using takeIf & takeUnless function:")
    println(mayReturnNull(2).takeIf { it != null }?.also (::maskEOThenPrint))
    println(mayReturnNull(2).takeUnless { it == null }?.also (::maskEOThenPrint))
}

private fun replaceAWithB(str:String) = str.replace('A', 'B')

private fun replaceEO(str:String) = str.replace('e', '$').replace('o', '$')

private fun maskEOThenPrint(str:String){
    println(str.replace('E', '*', true)
        .replace('O', '*', true))
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