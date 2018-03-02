package cn.moverco.c4

import cn.moverco.c2.str

/**
 * 变长参数：
 * vararg args:String 等价于 args:Array<String>
 *
 *     某个参数可以接收多个值
 *     可以不为最后一个参数
 *     如果传参时有歧义，需要使用具名参数
 */
/**
 *
 * output:
3
1
5
4
ssss
 */
fun main(vararg args:String) {
    args.forEach(::println)
    val array = intArrayOf(3,1,5,4)
    /**
     *     “*” Spread Operator
     *     只支持展开Array
     *     只用于变长参数列表的实参
     *     不能重载
     *     不算一般意义的运算符
     */
    varP(ints = *array,str = "ssss")
}

/**
 *  默认参数
 *  可以为任意位置的参数指定默认值
 *  传参时，如果有歧义，需要使用具名参数传参
 */
fun varP(double: Double = 1.0,vararg ints:Int,str:String){
    ints.forEach(::println)
    println(str)
}