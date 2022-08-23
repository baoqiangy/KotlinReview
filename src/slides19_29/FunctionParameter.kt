package slides19_29

fun main() {
    //function variable
    val tripleMe = {value:Int -> 3 * value}

    calculate(5, tripleMe)

    //need :: for normal function
    calculate(5, ::doubleMe)

    //anonymous lambda
    calculate(5){
        it / 2
    }
    calculate(5, ::divideMe)

}

//normal function
fun doubleMe(value: Int) = 2 * value

fun divideMe(value: Int):Int{
    return value / 2
}

//function as a parameter
//inline function can be used to avoid function call caused by function parameter and save memory
//inline also allows the function parameter to return for program control of the inline function
//TODO - add a statement to the end of calculate to print "Done",
// then create printMe function to print the value and return at the end,
// check if Done is printed
fun calculate(value:Int, operation:(Int)->Int){
    println(operation(value))
}