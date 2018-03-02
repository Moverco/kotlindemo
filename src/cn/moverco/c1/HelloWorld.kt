package cn.moverco.c1

import cn.moverco.c3.package1.TypeDemo
class HelloWorld
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