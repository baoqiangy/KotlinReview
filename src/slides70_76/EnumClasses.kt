package slides70_76

enum class Direction (private val coordinate: Coordinate) {
    NORTH(Coordinate(0, -1)),
    SOUTH(Coordinate(0, 1)),
    WEST(Coordinate(-1, 0)),
    EAST(Coordinate(1, 0));

    fun updateCoordinate(playCoordinate: Coordinate){
        //TODO - use the plus operator to implement updateCoordinate for Direction enum class
    }
}

fun main() {
    val playCoordinate = Coordinate(6, 7)
    println(Direction.EAST.updateCoordinate(playCoordinate))
}