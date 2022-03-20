//定义类的时候
class User(var name: String, var age: Int)

//为user添加扩展方法
fun User.introduce() {
    println("My name is ${name}.I am ${age} years old")
}

fun IntArray.tellSize() {
    println(size)
}

fun main() {
    val u = User("yinfu", 18)
    println("${u.name} ${u.age}")
    u.introduce()
    //为intArray添加方法
    intArrayOf(1, 2, 3).tellSize()
}

