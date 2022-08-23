package slides86_90

fun main() {

    outerloop@for (i in 0..10){
        for (j in 1..5){
            println("$i - $j")
            if(j>3) break@outerloop
        }
    }


    println("After nested loop")
}