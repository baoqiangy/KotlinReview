package slides86_90

//SAM - single abstract method
interface Runnable{
    fun run()
}

interface Callable<T>{
    fun call():T
}

fun main() {
    val runnable = object : Runnable{
        override fun run() {
            println("I am a runnable")
        }
    }
    JavaRun.runNow(runnable)

    JavaRun.run {
        println("Using lambda as SAM object")
    }

    JavaRun.run({println("Using function call syntax")})
}