package slides66_68

object DatabaseConnection {
    var status:String = "Disconnected"
    val serverURL:String = "http://localhost"
    init {
        println("Initializing database connection to $serverURL...")
        status = "Connected"
    }

    fun executeSQLQuery(query:String){
        println("Executing \"$query\"")
    }
}

