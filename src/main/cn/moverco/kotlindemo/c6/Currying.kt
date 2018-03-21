package cn.moverco.kotlindemo.c6

import java.io.OutputStream

/**
 * Currying
 *  即多元函数变成一元函数调用链
 *
 *  偏函数
 *      传入部分参数得到新的函数
 */
fun log(tag: String, target: OutputStream, message: Any?) {
    target.write("[$tag]$message\n".toByteArray())
}
val log2 = fun(tag: String, target: OutputStream, message: Any?) {
    target.write("[$tag]$message\n".toByteArray())
}
fun curryLog(tag: String) = fun(target: OutputStream) = fun(message: Any?) = target.write("[$tag]$message\n".toByteArray())

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried() = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.partial1(p1: P1) = fun(p2: P2, p3: P3) = this(p1, p2, p3)
fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.partial2(p2: P2) = fun(p1: P1, p3: P3) = this(p1, p2, p3)
fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.partial3(p3: P3) = fun(p1: P1, p2: P2) = this(p1, p2, p3)

/**
 *output:
[Moverco]Log....
[Moverco]Log curry..
[Moverco]Log curried...
[Moverco]Log with Tag
[Moverco]Log with Partial..

 */
fun main(args: Array<String>) {
    log("Moverco", System.out, "Log....")
    curryLog("Moverco")(System.out)("Log curry..")
    ::log.curried()("Moverco")(System.out)("Log curried...")

    val logWithTag = (::log.curried())("Moverco")(System.out)
    logWithTag("Log with Tag")

    val logWithPartial = log2.partial1("Moverco")
    logWithPartial(System.out,"Log with Partial..")
}

