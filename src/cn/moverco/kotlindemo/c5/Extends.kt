package cn.moverco.kotlindemo.c5

/**
 * 扩展成员
 * 1、为现有类添加方法、属性
 *  -----fun X.y():Z{......}
 *  -----val X.m注意扩展属性不能初始化，类似接口属性
 * 2、Java调用扩展成员类似调用静态方法
 *
 */
operator fun String.times(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int){
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

fun main(args: Array<String>) {
    println("milton"*10)
}