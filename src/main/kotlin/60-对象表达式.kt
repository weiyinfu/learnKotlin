open class User4 {
    val name = "haha"
}

object DataManager {
    val a: ArrayList<String> = arrayListOf()
    fun registerData(s: String) {
        a.add(s)
    }
}

class Student2 {
    companion object one {
        //这就相当于静态成员变量，静态区域只能有一个
        var studentCount = 0
    }

    var id = 0

    init {
        id = studentCount++
    }
}

fun main() {
    val x = object : User4() {
        fun run() {
            println("run")
        }
    }
    x.run()
    DataManager.registerData("one")
    DataManager.registerData("two")
    println(DataManager.a.size)

    val s = Student2()
    println(s.id)
    val ss = Student2()
    println(ss.id)
}