package slides54_62

lateinit var dog1: Dog

fun main() {
    //TODO - check the memory address of dog
    println("before initializing dog1")
    dog1 = Dog()

    val dog2 by lazy {
        Dog()
    }
    //TODO - check the state of dog2 in debugger
    println("before accessing dog2")
    dog2.age = 9
    println(dog2)
}