import kotlin.random.Random
import kotlin.random.nextUInt

fun main() {
    val r = Random(0)
    var x = if (r.nextBoolean()) 3 else 4
    x = if (r.nextBoolean()) {
        println("haha")
        4
    } else {
        5
    }
    when (r.nextInt() % 5) {
        1 -> println("one")
        2 -> println("two")
        3, 4 -> println("3 or 4")
        in 1..4 -> println("在[1,4]之内")
        !in 2..5 -> println("不在[2,5]")
        is Int -> {
            println("类型是int")
        }
        else -> {
            println("其它")
        }
    }

    when {
        r.nextBoolean() -> println("true")
        else -> {
            println("haha")
        }
    }

    val items = setOf(1, 2, 3)
    println(items.javaClass)
    for (i in items) {
    }
    for (i: Int in items) {
    }
    for ((ind, v) in arrayOf(1, 2, 3).withIndex()) {
        println("${ind}=${v}")
    }


}