package slides47_53

fun main() {
    val numbers = listOf(1,1,2,3,2)
    println(numbers.size)

    //only one copy of duplicate elements left
    val uniqNumbers = numbers.toMutableSet()
    println(uniqNumbers.size)

    //adding duplicate elements would fail
    println("Updating and checking set:")
    println(uniqNumbers.add(3))
    println(uniqNumbers.size)
    println(uniqNumbers.contains(2))

    println("Accessing set elements:")
    println(uniqNumbers.elementAt(0))
    println(uniqNumbers.elementAtOrElse(8, { 0 } ))
    println(uniqNumbers.elementAtOrNull(8))

    //range used to create a for loop
    println("Shuffling a range:")
    (0..9).forEach {
        print("${uniqNumbers.shuffled().first()} ")
    }
}