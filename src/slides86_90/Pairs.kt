package slides86_90

fun main() {
    val pairF = 0..59 to 'F'
    val pairD = 60..69 to 'D'
    val pairC = 70..79 to 'C'
    val pairB = 80..89 to 'B'
    val pairA = 90..100 to 'A'

    println(pairA)

    //de-structuring a pair
    val (range, grade) = pairA
    println(range)
    println(grade)

    //maps are essentially composed of pairs
    val gradeMap = mapOf(pairA, pairB, pairC, pairD, pairF)
    println(gradeMap[80..89])

    //Pair can be used to return multiple values from a function
    val (status, message) = execQuery("select * from students")
    println("Query status - $status")
    println("Message - \"$message\"")
}

//Pair can be used to return multiple values from a function
fun execQuery(query:String):Pair<String, String>{
    if((0..1).shuffled().first() == 1)
        return ("Success" to "Data successfully retrieved")
    else
        return ("Fail" to "Error occurred when executing $query")
}
