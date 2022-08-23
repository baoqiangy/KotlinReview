package slides19_29
//TODO - uncomment to see the error then try it in REPL
//This won't work in kt file, but works in REPL
//{value:Int -> println(value)}(5)

//TODO - add display6 to main(), it won't do anything
//This is OK
val display6 = {value:Int -> println(value)}(6)     //lambda/anonymous function call

//function variable
val display  = {value:Int -> println(value)}        //display is now a function

fun main() {
    {value:Int -> println(value)}(5)
    display(7)

    //lambda returning a value
    //function type is inferred here
    val add = {a:Int, b:Int -> a + b}
    val result = add(6, 8)
    println(result)

    //lambda with local a variable
    //variable is now of type function explicitly
    val scale:(Int)->Int = {a:Int ->
        val level = 3
        a * level
    }

    //TODO - rewrite scale lambda to use it instead of a

    println(scale(6))
}
