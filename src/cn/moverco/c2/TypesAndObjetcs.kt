package cn.moverco.c2

/**
 * 类的继承
 * 提取多个类的共性得到一个更抽象的类，即父类
 * 子类拥有父类的一切特征
 * 子类也可以自定义自己的特征
 * 所有类都最终继承自Any
 *
 */
class Phone constructor(os: String, color: String) : Equipment(os, color)
class Laptop constructor(os: String, color: String) : Equipment(os, color)

open class Equipment(var os: String, var color: String) {
    init {
        println("${this.javaClass.simpleName}:os:$os,color:$color")
    }
}

/**
 * output:
Phone:os:android,color:black
Laptop:os:android,color:black
true
true
 */
fun main(args: Array<String>) {
    val newPhone: Phone = Phone("android", "black")
    val newLaptop: Laptop = Laptop("android", "black")

    println(newPhone is Any)//true
    println(newLaptop is Equipment)//true
}