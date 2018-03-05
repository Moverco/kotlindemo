package cn.moverco.kotlindemo.c5

interface A {
    fun x(): Int = 1
}

interface B {
    fun x(): Int = 2
}

abstract class C {
    open fun x(): Int = 3
}

/**
 * 接口方法冲突
 * 1、接口方法可以有默认实现
 * 2、签名一致且返回值相同的冲突
 * 3、子类（实现类）必须覆写冲突方法
 * 4、super<父类（接口）名>.[方法名]([参数列表])
 */
class D(var y:Int) : B, A, C() {
    //两个接口中方法名相同时的冲突

    override fun x(): Int {
        println("call x() from different interfaces")
        if (y > 0) {
            return super<C>.x()
        } else if (y < 0) {
            return super<B>.x()
        } else {
            return super<A>.x()
        }
    }

}

/**
 * output:
call x() from different interfaces
2
call x() from different interfaces
1
call x() from different interfaces
3
 */
fun main(args: Array<String>) {
    println(D(-1).x())
    println(D(0).x())
    println(D(1).x())
}