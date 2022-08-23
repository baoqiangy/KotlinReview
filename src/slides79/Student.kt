package slides79

abstract class Student(open val name:String,
                       open val age:Int,
                       open val gender:Char)
{
    abstract var type:String
    abstract fun take(course:String)

    override fun toString(): String {
        return "$type student $name ($gender)"
    }
}

