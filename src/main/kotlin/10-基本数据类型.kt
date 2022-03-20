fun main() {
    val byte: Byte = 0
    val short: Short = 1
    val int: Int = 1
    val long: Long = 2_124_34_3
    val double: Double = 10.0
    val float: Float = 10.0f
    val bool: Boolean = false
    val char: Char = 'x'

    //java不支持无符号数，kotlin支持
    val ubyte: UByte = 3u
    val ushort: UShort = 3u
    val uint: UInt = 3u
    val ulong: ULong = 3u

    //字符串判断相等
    var s = ""
    for (i in 1..4) {
        s += i
    }
    var ss = ""
    for (i in 1..4) {
        ss += i
    }
    println(s == ss)//返回true
}