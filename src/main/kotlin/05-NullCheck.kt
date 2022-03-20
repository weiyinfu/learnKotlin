fun main() {
    var age: String? = null
    try {
        val b = age!!.toInt()//如果age为空，则抛出异常
    } catch (e: Exception) {
        println("toInt error")
    }
    val x = age?.toInt()//不走处理返回null
    var c = age?.toInt() ?: -1//使用默认值-1
    println(x is Int)
    println(x is Int?)
}