package slides54_62

//TODO - follow slides 54-62 for live demo
class Dog{

    var name:String = ""
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    //TODO - make age read only by making setter private or
    // creating a private copy (changeable internally) and
    // a public copy with only getter
    var age:Int = 0
        get() = field
        set(value) {
            field = value
        }

    var country = ""

    fun bark(){
        var sound = when(country){
                    "Albanian" -> "ham-ham"
                    "Balinese" -> "kong-kong"
                    else       -> "wang-wang"
                }
        println(sound)
    }
}

fun main() {
    var dog = Dog()
    dog.name="Peter"
    dog.age=6
    dog.country="China"
    dog.bark()
}
