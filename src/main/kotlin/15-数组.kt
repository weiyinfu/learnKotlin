fun main() {
    val x = arrayOf(1, 2, 3)//数组
    val y = arrayListOf<Int>(1, 2, 3)//arrayList
    println(y[1] + y[2])//arrayList可以直接访问下标
    println(x.size)
    println(y.size)
    for (i in x) {
        print(i)
    }
    println()

    val a = intArrayOf(1, 2, 3, 4)
    println(a)
    a.forEach { x ->
        print(x)
    }
    a.forEachIndexed { index, i ->
        {
            println("${index}=>${i}")
        }
    }
}