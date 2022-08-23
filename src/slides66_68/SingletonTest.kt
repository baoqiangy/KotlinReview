package slides66_68

fun main() {
    DatabaseConnection.executeSQLQuery(
            "select * from users;")
    DatabaseConnection.executeSQLQuery(
            "delete * from users where id = 3;")
}