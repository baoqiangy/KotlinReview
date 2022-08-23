package slides19_29

private fun configureGreetings(greetings:String):(String)->Unit{
    return {
        println("$greetings, $it")
    }
}

fun main() {
    val morning = configureGreetings("Good morning")
    morning("Johnson")
    val evening = configureGreetings("Good evening")
    evening("Johnson")
}