package slides70_76

//Non-data class use component operator to provide de-structuring
//TODO - compare this destructuring with data class's destructuring
class PlayerScore (val experience:Int, val level:Int) {
    operator fun component1() = experience
    operator fun component2() = level
}

fun main() {
    val playerScore = PlayerScore(5, 6)
    val (experience, level) = playerScore
    println("experience - $experience")
    println("level - $level")
}
