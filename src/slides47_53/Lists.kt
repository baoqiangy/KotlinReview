package slides47_53

import kotlin.math.roundToInt

fun main() {
    val readOnlyNumbers:List<Double> = listOf(1.2, 3.4, 5.6)
    println(readOnlyNumbers[2])

    //safe index access
    println(readOnlyNumbers.getOrElse(6, {0.0}))
    println(readOnlyNumbers.getOrNull(6))

    //readOnlyNumbers[0] = 8.8      //not allowed for read only list
    val mutableNumbers = mutableListOf(1.2, 3.4, 5.6)
    mutableNumbers.add(6.7)
    mutableNumbers.add(0, 3.8)
    println(mutableNumbers)
    mutableNumbers.remove(3.4)
    println(mutableNumbers)
    println(mutableNumbers.sumBy { it.roundToInt() })
    mutableNumbers.removeIf  { it < 2 }
    println(mutableNumbers)
    mutableNumbers.removeAt(1)
    println(mutableNumbers)
    mutableNumbers.removeAll { it > 5 } //same as removeIf if taking lambda as the predicate
    println(mutableNumbers)
    mutableNumbers[0] = 8.8
    println(mutableNumbers)
    mutableNumbers.set(0, 6.8)
    println(mutableNumbers)
    mutableNumbers.clear()
    println(mutableNumbers)

    val mutableInts = mutableListOf(1,2,3,4,5,6)
    //iterate through lists
    println("Iterating through list:")
    printIntList(mutableInts)
}

//three ways of printing list piece by piece
private fun printIntList(list: MutableList<Int>){
    for(element in list)
        println(element)

    list.forEach(::println)

    list.forEachIndexed { index, i ->
        println("$index - $i")
    }
}
