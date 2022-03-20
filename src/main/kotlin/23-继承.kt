/**用户基类**/
open class Person {
    open fun study() {       // 允许子类重写
        println("我毕业了")
    }
}

/**子类继承 Person 类**/
//注意Person后面有一对括号
class Student : Person() {

    override fun study() {    // 重写方法
        println("我在读大学")
    }
}

fun main(args: Array<String>) {
    val s = Student()
    s.study();
}