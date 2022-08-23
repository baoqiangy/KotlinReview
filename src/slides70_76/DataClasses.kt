package slides70_76

data class Coordinate(val x:Int, val y:Int) {
    val isInBounds = x >= 0 && y >= 0
    var lengthUnit = "Meter"
    //TODO - define plus operator for coordinates
}

fun main() {
    val coordinate1 = Coordinate(231, 445)
    val coordinate2 = Coordinate(231, 445)
    coordinate2.lengthUnit = "centimeter"
    println(coordinate1.equals(coordinate2))
    println(coordinate1 ==  coordinate2)
    println(coordinate1 === coordinate2)
    val coordinate3 = coordinate2.copy(y = 110)
    println(coordinate3)
    println(coordinate3.lengthUnit)
    println(coordinate1 == coordinate3)
    println(coordinate1.hashCode())
    println(coordinate2.hashCode())
    println(coordinate3.hashCode())

    //TODO - call the plus operator using operator symbol here

    //Data class provides de-structuring by default
    val coordinate = Coordinate(231, 445)
    var (x, y) = coordinate
    println("x - $x y - $y")
}
