package slides47_53

fun main() {
    val nameScoreMap = mapOf("John" to 89.0, "Chuck" to 100.0)
    println(nameScoreMap)
    println(nameScoreMap.containsKey("Chuck"))
    println(nameScoreMap.contains("Stacey"))

    //The following getValue will crash the program. To see why,
    //Uncomment it and mouse over the function name getValue,
    // check the return type
    // println(nameScoreMap.getValue("Stacey"))

    //This won't crash the program
    println(nameScoreMap.get("Stacey"))

    //nameScoreMao is immutable
    //nameScoreMap += "Tom" to 90.0

    val courseTeacherMap = mutableMapOf(Pair("Java", "Dr. Baoqiang Yan"),
                                        Pair("Database", "Connie Hecker"),
                                        Pair("Networking", "Dr. Yipkei Kwok"))
    courseTeacherMap += "Office365" to "Evan Noynaert"
    println("Accessing individual map entries:")
    println(courseTeacherMap)
    println("The teacher of Office365 is ${courseTeacherMap["Office365"]}")
    println("The teacher of Database is ${courseTeacherMap.get("Database")}")
    println("The teacher of Cybersecurity is ${courseTeacherMap.getOrElse("Cybersecurity"){"Unknown"}}")
    println("The teacher of Cybersecurity is ${courseTeacherMap.getOrDefault("Cybersecurity", "Unknown")}")

    println("Iterating through map entries:")
    courseTeacherMap.forEach { k, v ->
        println("$k - $v")
    }

    println("Changing map:")
    courseTeacherMap.put("Cybersecurity", "Kent Pickett")
    courseTeacherMap.remove("Office365")
    courseTeacherMap -= "Database"
    println(courseTeacherMap)
    courseTeacherMap.clear()
    println(courseTeacherMap)
}