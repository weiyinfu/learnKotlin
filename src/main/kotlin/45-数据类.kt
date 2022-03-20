class User1(var name: String, var age: Int)
data class User2(var name: String, val age: Int)
data class User3(val age: Int, val name: String = "Kotlin")//可以使用默认值

fun main() {
    val u = User2("one", 18)
    val (name, age) = u//解构
    val uu = u.copy(name = "haha")//使用copy复制类
}