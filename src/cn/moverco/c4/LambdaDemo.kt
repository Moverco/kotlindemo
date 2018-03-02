package cn.moverco.c4

/**
 * Lambda表达式 即 匿名函数
 * 写法:{[参数列表]->[函数体，最后一行是返回值]}
 * 简化：
 * 1.函数参数调用时最后一个Lambda可以移出去
 * 2.函数参数只有一个Lambda，调用时小括号可以省略
 * 3.Lambda只有一个参数可默认为it
 * 4.入参、返回值与形参一致的函数可以用函数引用的方式作为实参传入  args.forEach(::print)
 */
/**
 * output:
25klhimn
25klhimn
25klhimn
25klhimn
25klhimn
25klhmnEND
 */
fun main(args: Array<String>) {
    for (i in args) {
        print(i)
    }
    println()
    args.forEach { print(it) }
    println()
    args.forEach() { print(it) }
    println()
    args.forEach({ print(it) })
    println()
    args.forEach(::print)
    println()
    //如果没有ForEach@那么Lambda表达式中的return返回的将是main函数，即最后的”END“不会被打印出来
    args.forEach ForEach@ {
        if (it == "i") return@ForEach
        print(it)
    }
    println("END")
}