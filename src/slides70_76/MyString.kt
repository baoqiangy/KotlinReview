package slides70_76

class MyString(val content:String) {

    operator fun inc():MyString{
        return MyString(content.first() + content)
    }

    operator fun plus(str:MyString):MyString{
        return MyString(str.content + " " + content)
    }

    operator fun get(i:Int, j: Int):MyString{
        return MyString(content.substring(i..j))
    }
}

fun main() {
    var str1 = MyString("Yan")
    val str2 = MyString("Baoqiang")
    println((str1+str2).content)

    repeat(5){
        str1 = (++str1)
        println(str1.content)
    }

    println(str2[2, 5].content)
}