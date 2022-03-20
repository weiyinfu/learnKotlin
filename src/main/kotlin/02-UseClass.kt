interface Animal {
    fun shout();
}

class Dog : Animal {
    override fun shout() {
        println("wang wang")
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(vararg v: Int): Int {
    var s = 0
    for (i in v) {
        s += i
    }
    return s
}

fun main() {
    val d = Dog()//var为变量，val为常量
    d.shout()
    println(sum(1, 2))
    println(sum2(1, 2, 3))
    //使用函数
    val sum3: (Int, Int) -> Int = { x, y ->
        x + y
    }
    println(sum3(1, 2))
}