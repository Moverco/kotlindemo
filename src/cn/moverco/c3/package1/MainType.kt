package cn.moverco.c3.package1

/**
 * kotlin中包不一定于路径一致，但不推荐
 * 包即命名空间
 * 包的声明必须在非注释代码的第一行
 */

import cn.moverco.c3.package2.TypeDemo as NewType

fun main(args: Array<String>) {
    val demo1:TypeDemo = TypeDemo("type1")
    val demo2:cn.moverco.c3.package2.TypeDemo = cn.moverco.c3.package2.TypeDemo("type2")
    //使用as关键字，可将上一行简写为
    val demo3:NewType = NewType("new type")

}