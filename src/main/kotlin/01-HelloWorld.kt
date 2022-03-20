fun main(args: Array<String>) {
    println("hello")
    val a = 1//自动类型推断
    var b = 1//定义变量
    b = 3
    var c: Int = 3
    c = 4
    val d = 5
    //使用字符串模板
    println("a=${a} b=${b} c=${c}")
    println(
        """
        kotlin
        is
        the best language in the world
        
    """.trimIndent()
    )

    //在kotlin中，一切皆Any
    println("${a is Any} ${b is Any} ${"" is Any}")
}
