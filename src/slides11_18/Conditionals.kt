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

    //Conditional expressoin in assignment
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
}