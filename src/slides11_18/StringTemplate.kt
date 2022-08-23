package slides11_18

fun main() {
    val score:Int = 89
    val grade:Char = 'B'
    val pass:Boolean = true
    val numbers:List<Int> = (3..10).toList()

    println("Your grade is $grade with a score of $score. You passed the course? $pass")
    println("You can even pass list in string template. Here is one example, $numbers")
    println("When using expressions in string template, you have to wrap them in \${} like \${numers[2]}. " +
            "You get ${numbers[2]}")
    //TODO - try a few more expressions, remember that these expressions should relative simple ones
}