package cn.moverco.kotlindemo.c6

/**
 * 传入或者返回函数的函数为高阶函数
 *  常见的高阶函数有
 *  forEach/map/flatMap/flod/reduce/filter/takeWhile/let/apply/wit/use
 */
class Printer{
    fun print(any:Any){
        kotlin.io.print(any)
    }


}

fun main(args: Array<String>) {
    args.forEach(::println)
    val printer = Printer()
    args.forEach (printer::print)

}