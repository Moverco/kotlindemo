package cn.moverco.kotlindemo.c6

/**
 * 闭包
 *  函数运行的环境
 *  持有函数运行状态
 *  函数内部也可以定义函数
 *  函数内部也可以定义类
 */
fun count(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}

fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L
    return fun(): Long {
        val result = second
        second = first + second
        first = second - first
        return second
    }
}

fun add(x: Int) = fun(y: Int) = x + y
