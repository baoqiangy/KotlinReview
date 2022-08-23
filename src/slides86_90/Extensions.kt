package slides86_90

//1. You can add functions/properties to classes you don't own
//TODO - make the following fun real kotlin style (short)
fun String.hasSpaces():Boolean{
    //'this' is used outside {} while 'it' inside {}
    val found:Char? = this.find {it == ' '}
    return found != null
}

fun Int.isEven() = this % 2 == 0
val Int.isOdd:Boolean
    get() = this % 2 != 0

//2. You can also use extensions to add "non-core" functions/properties for your own classes
//   but extensions can only be applied to public APIs/properties
class Flower(val color:String, private val season:String)
fun Flower.isRed() = color.equals("Red")
val Flower.isGreen:Boolean
    get() = color.equals("Green")
//fun Flower.isSummerFlower() = season.equals("Summer")

//3. You can make the extensions usable on nullable objects/values
fun Flower?.print(){
    this?.apply {
        println(color + " flower")
    }
}

//4. Extension lambda
fun myWith(str:String, block: String.()->Unit){
    "Test".block()
    str.block()
}

fun main() {
    println("Does this have spaces?".hasSpaces())
    println(4.isEven())
    println(5.isOdd)
    println(Flower("red", "Fall").isGreen)
    Flower("red", "Fall").print()
    println("Testing extension on nullible objects:")
    val flower:Flower? = null
    flower.print()

    myWith("Hello"){
        println(this.toUpperCase())
    }
}
