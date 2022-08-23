package slides80_82

class Container<T>(vararg items:T){
    private var isOpen = false
    private var items:Array<out T> = items

    //single type generics
    operator fun get(index: Int):T? =
        items[index].takeIf { isOpen }

    //multi type generics
    fun <R> fetch(index: Int, processItem:(T)->R): R?{
        return processItem(items[index]).takeIf {
            isOpen
        }
    }

    fun open(){
        this.isOpen = true
    }
}
