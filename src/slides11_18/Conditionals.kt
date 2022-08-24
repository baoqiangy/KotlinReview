package slides11_18

fun main() {
    val first = Integer(10)
    val second = Integer(10)

    //value vs. reference comparison
    println(first == second)       //true
    println(first != second)       //false
    println(first.equals(second))  //true
    println(first === second)      //false
    println(first !== second)      //true

    val score = 60

    //Conditional expression in assignment
    var grade = if (score>=90)          'A'
                else if (score >= 80)   'B'
                else if (score >= 70)   'C'
                else if (score >= 60)   'D'
                else                    'F'

    //Range using ..
    grade = if (score in 90..100)       'A'
            else if (score in 80..89)   'B'
            else if (score in 70..79)   'C'
            else if (score in 60..69)   'D'
            else                        'F'

    //char range and when expression (like the switch statement)
    //Remember: there is a -> in between the condition and action

    when(grade){
        in 'A'..'C' ->  println("Pass")
        //else        ->  println("Fail")
    }
    //else is required to make cases exhaustive if 'when' is used
    //in another expression or statement
    val isUnit = when(grade){
        in 'A'..'C' ->  println("Pass")
        else        ->  println("Fail")
    }

    /*
    There are various ways to define the value(s) to compare against:
        Fixed value (700)
        Multiple fixed values (0, 1, 2)
        Ranges (in 300..699)
        Ranges with negation (“not in range”) (!in 0..300)
        Function call (earthSurfaceTemp())
        Type check (is Int)
        Default case (else)
    * */
    var temperatureInKelvin = 89;
    when(temperatureInKelvin) {
        700                     -> println("This is Mercury’s max surface temperature")
        0, 1, 2                 -> println("This i as cold as it can physically get")
        in 300..699       -> println("This temperature is possible on Mercury")
        !in 0..300        -> println("This is pretty hot")
        earthSurfaceTemp()      -> println("This is earth’s average surface temperature")
        is Int                  -> println("The given temperature is of type Int")
        else                    -> {
            // Example of a multiline code block
            println("Default case")
        }
    }
}

fun earthSurfaceTemp():Int = 288