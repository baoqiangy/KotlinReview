package slides80_82

open class Juice(val fruit:Fruit) {
    override fun toString(): String {
        return "${fruit.name} juice"
    }
}