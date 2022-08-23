package slides80_82

open class Dog(
    _name:String,
    _age:Int,
    var country:String
) {

    lateinit var breed:String

    var name:String = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    var age:Int = _age
        get() = field
        private set(value) {
            field = value
        }

    constructor():this(_name = "",
            _age = 1,
            country = "China"
        )

    constructor(name:String):this(name,
            _age = 1,
            country = "China"
        )

    init {
        require(age > 0, {"Age must be positive."})
        requireNotNull(name, {"Name must be specified."})
    }

    open fun bark(){
        var sound = when(country){
                    "Albanian" -> "ham-ham"
                    "Balinese" -> "kong-kong"
                    else       -> "wang-wang"
                }
        println(sound)
    }

    protected open fun play(){
        println("$name is playing")
    }
}
