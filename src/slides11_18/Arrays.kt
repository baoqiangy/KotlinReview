package slides11_18

import java.util.*

fun main() {
    /**
     * Pay attention to the inferred types
     * */

    //array with different types of elements
    val mix = arrayOf("orange", 5, true, 6.7)
    println(mix[2])

    //typed array
    val intArray = intArrayOf(1,2,3,4,5)
    //val boolArray = booleanArrayOf(true, 1, false)

    //multidimensional array or nested array
    val mdArray = arrayOf(1,2, arrayOf(3,4))
    println(Arrays.toString(mdArray))

    //TODO - create a matrix

    //dynamically initialzed array using Array class
    val mapped = Array(5){}
    //TODO - check what is in mapped using debugger

    //TODO - try calling a function on one element, see what happens

    val array = Array(5){ it * 2}   //we will discuss lambda later
    println(Arrays.toString(array))

    //filtering an array
    println(array.filter { it > 2 })
}