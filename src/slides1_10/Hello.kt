package slides1_10

fun main(args:Array<String>) {
    println("Hello World!")

    val kCircle = KotlinCircle()
    kCircle.radius = 4.00
    println(kCircle.radius)

    val jCircle:JavaCircle = JavaCircle()
    jCircle.radius = 6.00
    println(jCircle)
}