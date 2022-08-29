package slides1_10

/*
consts are compile time constants. Meaning that their value has to be assigned during compile time, unlike vals,
where it can be done at runtime.
This means, that consts can never be assigned to a function or any class constructor, but only to a String or
primitive.
* */

const val c = 4

val v = fib(5)

fun fib(n:Int):Int{
    if(n <= 1)
        return n
    return fib(n-1)+fib(n-2)
}

fun main() {

    var a = 3
    a = 6
    val b = 4
    //b = 5     //This would cause syntax error since val is not changeable

    //The above two variables' types are inferred (namely, not explicitly declared)

    //The compiler will automatically check the size to make sure the value fits in the memory
    var myByte:Byte = 0b00100010
    var myShort:Short = 0x5FFF
    var myInt:Int = 0x0BCDEF88
    var myLong:Long = 1_000_000
    //The underscore symbol _ is allowed to make number more readable
    var myDouble:Double = 1_000_000.45
    var myBoolean:Boolean = true
    var myChar:Char = 'A'
    var myString:String = "Today is a beautiful day."
    var myList:List<Int> = listOf(1,2,3,4,5)
    var mySet:Set<String> = setOf("Apple", "Orange", "Strawberry")
    var myMap:Map<IntRange, Char> = mapOf((0 until 70) to 'F', (70 until 100) to 'P')

    //no implicit type promotion, needs explicit casting
    //myInt = myShort   //This won't work
    myInt = myShort.toInt()

    //Primitives can be treated as objects, namely you can call methods on them.
    //Internally these primitives are boxed before calling the methods.
    var d = myInt.dec()
    var e = myInt.plus(5)
    3.minus(4)
    6.div(4)    //this gives us 1
    2.times(5)
}