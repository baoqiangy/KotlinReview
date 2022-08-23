package slides79

class ElementaryStudent(override val name:String,
                        override val age:Int,
                        override val gender:Char
                        ):Student(name, age, gender) {
    override var type: String
        get() = "Elementary"
        set(value) {type=value}

    override fun take(course: String) {
        println("$this takes $course")
    }
}

