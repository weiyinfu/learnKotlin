import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val a = ArrayList<Int>()
    val r = Random(0)
    for (i in 1..20) {
        a.add(r.nextInt() % 100)
    }
    a.sort()
    println(a)
}