package slides19_29

//default is public
fun main() {
    val a = 3
    val b = 4

    //TODO - refactor the following addition into a private function in two different ways
    //TODO - then try the key points on the following slides
    val r = a + b
}

fun doubleInput(i:Int):Int{
    return 2 * i
}

//Internal function is available in the same module/project.
//This is a top-level internal function.
internal fun sleep(){
    println("Sleeping")
}

//class will be discussed later
class Student{
    //protected functions cannot be in top level scope
    //since it is used in a class hierarchy.
    protected fun study(course:String){
        println("Studying for $course ...")
    }

    //TODO - try removing Unit return type
    //This is a class member internal function
    internal fun eat(food:String, amount:Int):Unit{
        println("Eating $amount $food ...")
    }

    private fun pass(score:Int):Boolean{
        return when(score){
            in 70..100  -> true
            else        -> false
        }
    }
}
