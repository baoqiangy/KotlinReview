package slides80_82

class MaleDog:Dog() {
    fun description() = "$name - $age"
    override fun bark(){
        println("${javaClass.name.split(".").last()} $name barking")
    }

    override fun play() {
        print("Male dog ")
        super.play()
    }
}