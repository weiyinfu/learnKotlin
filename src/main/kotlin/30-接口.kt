//接口也可以有带实现的方法
interface Animal3 {
    fun run() {
        println("I am running")
    }

    fun shout()
}

interface AA {
    fun foo() { print("A") }   // 已实现
    fun bar()                  // 未实现，没有方法体，是抽象的
}

interface BB {
    fun foo() { print("B") }   // 已实现
    fun bar() { print("bar") } // 已实现
}

class CC : AA {
    override fun bar() { print("bar") }   // 重写
}

class D : AA, BB {
    override fun foo() {
        super<AA>.foo()
        super<BB>.foo()
    }

    override fun bar() {
        super<BB>.bar()
    }
}