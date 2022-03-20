enum class Sky {
    Earth, Moon, Sun
}

enum class Sky2(val value: Int) {
    Earth(100),
    Moon(200),
    Sun(300),
}

fun main() {
    val x = Sky2.Earth
    println("${x} ")
}