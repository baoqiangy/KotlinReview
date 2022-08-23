package slides30_37

import java.io.File

//Nullable return value (? required)
private fun mayReturnNull(i:Int):String?{
    var result = when(i){
        1 -> "Hello"
        2 -> "How are you?"
        else -> null
    }
    return result
}

fun main() {
    //checkNotNull still returns the non-null value that is being checked
    //TODO - wrap the following statement in try/catch
    println(checkNotNull(mayReturnNull(2), {"null returned from myReturnNull"}))

    //requireNotNull throws a different type of exception
    //TODO - figure out what the possible exception is then wrap the following statement in try/catch
    println(requireNotNull(mayReturnNull(2), {"null returned from myReturnNull"}))

    //require check a boolean expression, does not return the non-null value
    // and always throws exception when the value is null, no matter whether
    // the 2nd argument is specified or not
    println(require(mayReturnNull(1) != null))
    //TODO - figure out what the possible exception is then wrap the following statement in try/catch
    //require(mayReturnNull(3) != null, {"non-null value from myReturnNull required"})

    //-ea needs to be enabled : Run -> Edit Configurations -> Select the file you run -> VM Options -> -ea
    //assert throws AssertionError exception if applicable, does not return the value even if it is not null
    println(assert(mayReturnNull(1) != null))
    println("After assertion")

}

/**
* require(Boolean) throws IllegalArgumentException when its argument is false. Use it to test function arguments.
* check(Boolean) throws IllegalStateException when its argument is false. Use it to test object state.
* assert(Boolean) throws AssertionError when its argument is false (but only if JVM assertions are enabled with -ea). Use it to clarify outcomes and check your work.
*/

//Practical usages of precondition functions

//1. To check assumptions about function arguments, use require:
//2. To check assumptions about things that are not function arguments, use check:
//3. To promise results, use assert:
class Pump(var isActive:Boolean=false)
val pumps = Array(6){Pump()}

fun activate(index: Int) {
    // Argument Assumption: |index| is a non-negative integer.
    require(index >= 0 && index < pumps.size) { "Int |index| must be within 0-${pumps.size-1}. index=$index" }

    //Your activation logic here

    // Ending State Promise: The pump at |index| is now active.
    assert(pumps[index].isActive) { "Failed to activate pump index=$index" }
}

fun load(from: File): String {
    // Argument Assumption: |from| is a readable file.
    require(from.canRead()) { "File |from| must be readable. file=$from canRead=${from.canRead()}" }

    //Your file handling logic here

    return "Content of ${from.absolutePath}"
}

class Host(var url:String)
class Blocks(var data:Array<Byte>)

class Socket {
    var isConnected: Boolean = false
    var connectedHost: Host? = null

    fun connect(to: Host, result: (isConnected: Boolean) -> Void) {
        // Starting State Assumption: |this| is "not" already connected.
        check(!isConnected) {
            "|Socket.connect| cannot be called after a successful call to |Socket.connect|. "+
                    "socket=$this to=$to connectedHost=$connectedHost"
        }

        //Your logic for connecting to the target host
    }

    fun write(blocks: Blocks): Int {
        // Starting State Assumption: |this| is connected.
        check(isConnected) {
            "|Socket.connect| must succeed before |socket.write| can be called. "+
                    "socket=$this blocks=$blocks"
        }

        //Your logic for writing data to the socket

        return blocks.data.size
    }
}