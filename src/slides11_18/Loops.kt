package slides11_18

fun main() {
    val array = Array(2){ it % 2 == 0}

    println("foreach loop")
    for(boolVal in array)
        println(boolVal)

    println("foreach loop with index")
    for((index, boolVal) in array.withIndex())
        println("boolVal at index $index is $boolVal")

    println("indexed/counter loop using inclusive range")
    for(i in 0..array.size-1)
        println(array[i])

    println("indexed/counter loop using right exclusive range")
    for(i in 0 until array.size)
        println(array[i])

    println("indexed/counter loop using right exclusive range and a step")
    for(i in 0 until array.size step 2)
        println(array[i])

    println("inverse indexed/counter loop using right exclusive range and a step")
    for(i in array.size-1 downTo 0  step 2)
        println(array[i])

    println("while loop, just like any other high level language")
    var i = 0
    while(i<array.size) {
        println(array[i])
        i++
    }

    println("------------------------------------------")
    println("indexed/counter loop using inclusive range")
    for(x in 0..10) println(x)
    println("indexed/counter loop using right exclusive range")
    for(x in 0 until 10) println(x)
    println("indexed/counter loop using right exclusive range and a step")
    for(x in 0 until 10 step 2) println(x)
    println("inverse indexed/counter loop")
    for(x in 10 downTo 0) println(x)

    //repeat expression
    println("repeat action (lambda) inside parenthesis")
    repeat(3, { println("hello") })
    println("repeat action (lambda) after parenthesis")
    repeat(3){
        println("hello")
    }

    //break and continue are same as in Java
}