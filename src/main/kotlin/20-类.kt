class Cat {
    val name: String = "dog"
    val age: Int = 3
    val address = "beijing"
    var weight = 34
    fun shout() = "miao"//如果一个函数返回值为常量，直接等于即可
}

class Horse constructor(name: String)//每一个类都可以制定一个主构造器
class Horse2(name: String)//可以省略constructor
class Horse3(name: String) {
    var myName = "haha"

    //主构造器的实现
    init {
        println(name)
        myName = name
    }

    //次构造器的实现，次构造器必须调用主构造器，因此主构造器一般是无参构造函数
    constructor(x: Int) : this(x.toString()) {
    }
}

class UseGetterAndSetter {
    var name: String = "haha"
        get() {
            return this.name
        }
        set(value) {
            field = value
        }

    //get可以直接等于field
    var name2 = "haha"
        public get() = field
        //可以为属性设置可见性
        private set(value) {
            field = value
        }
}

//嵌套类
class Outter {
    //默认内部类为静态，使用inner关键字可以把它变成非static
    class Inner {
        constructor() {
            println("outter.inner")
        }
    }

    inner class Inner2 {
        init {
            println("outter.inner2")
        }
    }
}

interface Runner {
    fun run()
}

//默认类是不可以继承的，要想让类可以继承，需要使用open
open class Dog2 {

}

fun main() {
    val c = Cat()
//    c.name="wei"//不可变的成员变量禁止复制
    c.weight = 100
    println(c.shout())
    println("${c.address} ${c.name}")
    val h = Horse("haha")
    val x = Outter.Inner()
    val xx = Outter().Inner2()

    //匿名内部类
    val xxx = object : Runner {
        override fun run() {
            TODO("Not yet implemented")
        }
    }
}