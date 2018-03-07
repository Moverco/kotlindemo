package cn.moverco.kotlindemo.c5

/**
 *方法名或参数列表作为JVM签名
 *
 *
 */
class Overloads {
    fun a(): Int {
        return 1
    }

    fun a(int: Int): Int {
        return 2
    }
}

fun main(args: Array<String>) {
    val overloads = Overloads()
}