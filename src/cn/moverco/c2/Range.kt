package cn.moverco.c2

/**
 * Range表示范围，是CloseRange的子类
 *
 * output:
true
true
false
0,1,2,3,4,5,6,7,8,9,10,
 */
val range:IntRange = 0..10 //闭区间 [0,10]
val range2:IntRange = 0 until 10 //半开区间 [0,10)
val emptyRange = 0..-1
fun main(args: Array<String>) {
    println(emptyRange.isEmpty())//true
    println(10 in range)//true
    println(10 in range2)//false
    //实现循环输出
    for (i in range){
        print("$i,")
    }
}