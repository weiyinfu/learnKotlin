import kotlin.random.Random

fun main() {
    //闭区间从1到4
    for (i in 1..4) {
        print(i)
    }
    println()
    //什么都不输出
    for (i in 4..1) {
        print(i)
    }
    println()
    //4321，闭区间
    for (i in 4 downTo 1) {
        print(i)
    }
    println()
    //[1,4)
    for (i in 1 until 4) {
        print(i)
    }
    println()
    //1,4,7
    for (i in 1 until 10 step 3) {
        print(i)
    }
    println()
    val r = Random(0)
    while (true) {
        if (r.nextBoolean()) {
            break
        }
    }
    do {

    } while (r.nextBoolean());

    //break
    loop@ for (i in 1..100) {
        loop2@ for (j in 1..100) {
            for (k in 1..100) {
                if (r.nextBoolean()) {
                    break@loop
                } else {
                    break@loop2
                }
            }
        }
    }
}