package cn.moverco.kotlindemo.c2

import cn.moverco.c3.package1.TypeDemo

/**
 * 为避免不必要的装箱与拆箱，Kotlin提供了基本类型的数组
 *  java--Kotlin
 *  int[]  IntArray
 *  short[]   ShortArray
 *  long[]  LongArray
 *  float[] FloatArray
 *  double[]    DoubleArray
 *  char[]  CharArray
 */
val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
val charArray: CharArray = charArrayOf('a', 'b', 'c')
val strArray: Array<String> = arrayOf("a", "b", "c", "d")
val typeArray: Array<TypeDemo> = arrayOf(TypeDemo("1"), TypeDemo("2"))
/**
 * output:
7
1,
2,
3,
4,
5,
6,
7,
this is a new type: 2
this is a new type: new
a, b, c
abc
[2, 3, 4]
 *
 */
fun main(args: Array<String>) {
    println(intArray.size)
    for (i in intArray) {
        print("$i,")
        println()
    }
    println(typeArray[1])
    typeArray[1] = TypeDemo("new")
    println(typeArray[1])

    println(charArray.joinToString())
    println(charArray.joinToString(""))

    println(intArray.slice(1..3))

}