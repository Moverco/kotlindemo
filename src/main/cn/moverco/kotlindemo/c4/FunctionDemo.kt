package cn.moverco.kotlindemo.c4

/**
 * 函数即以特定功能组织起来的代码块
 * 以下几种写法效果相同
 * 注意事项
 * 1.功能要单一，单一原则
 * 2.函数名要做到顾名思义
 * 3.参数个数不要太多
 */
fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

fun sum1(arg1: Int, arg2: Int) = arg1 + arg2

val result = fun(arg1: Int, arg2: Int) = arg1 + arg2
//Lambda表达式 (Int,Int)->Int
val sum2 = {arg1:Int,arg2:Int -> arg1+arg2}
//默认返回值为Unit,相当于java中的Void
/**
 * output:
2+5=7
2+5=7
2+5=7
7
7
 */
fun main(args: Array<String>): Unit {

    checkArgs(args)
    val arg1: Int = args[0].toInt()
    val arg2: Int = args[1].toInt()
    println("$arg1+$arg2=${sum(arg1, arg2)}")
    println("$arg1+$arg2=${sum1(arg1, arg2)}")
    println("$arg1+$arg2=${result(arg1, arg2)}")
    println(sum2(arg1,arg2))
    println(sum2.invoke(arg1,arg2))
}


fun checkArgs(args: Array<String>) {
    if (args.size < 2) {
        println("pls enter more than 2 parameters")
        System.exit(0)
    }
}
