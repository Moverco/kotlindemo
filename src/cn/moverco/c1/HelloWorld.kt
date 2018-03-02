package cn.moverco.c1

import cn.moverco.c3.package1.TypeDemo
class HelloWorld

/**
 * val&var
 * val所定义的为常量，不可修改 类似于java中的final
 * var所定义的为变量
 *
 * 运行时常量 val x = ...
 * 编译器常量 const val x = 1
 *
 * 编译器可以推导量的类型，下述两行效果相同
 * val FINAL_HELLO_WORLD:String = "Hello World"
 * val FINAL_HELLO_WORLD = "Hello World"
 */
val FINAL_HELLO_WORLD:String = "Hello World"
var helloWorld:String = FINAL_HELLO_WORLD
var nullableHelloWorld:String? = helloWorld
val helloWorldArray:Array<Char> = arrayOf('H','e','l','l','o','W','o','r','l','d')
val helloWorldCharArray:CharArray = charArrayOf('H','e','l','l','o','W','o','r','l','d')
val length:Int = helloWorld.length
/**
 * output:
Hello World
Hello World
Hello World
HelloWorld
HelloWorld
length is 11
HelloWorld
cn.moverco.c1.HelloWorld
 */
fun main(args: Array<String>) {
    println(FINAL_HELLO_WORLD)
    println(helloWorld)
    println(nullableHelloWorld)
    println(helloWorldArray.joinToString(""))
    println(String(helloWorldCharArray))
    println("length is $length")
    println(HelloWorld::class.java.simpleName.slice(0 until length-1))
    println(HelloWorld::class.java.name)
}