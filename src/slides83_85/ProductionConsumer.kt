package slides83_85

interface ProductionConsumer<T> {
    fun produce():T
    fun consume(item:T)
}

