package cn.moverco.kotlindemo.c5

class House

class Flower

class Yard {
    private val house: House = House()
    private val flower: Flower = Flower()

}

class Yard2 {
    internal val houses = arrayOf(House(), House())
    val flowers = arrayOf(Flower(), Flower())

}

/**
 *          可见性对比
 *      --Kotlin----Java---
 *      private     private
 *      protected   peotected
 *      -           default(包内可见)
 *      internal(模块内可见)  -
 *      public      public
 *
 */
fun main(args: Array<String>) {
    val yard = Yard()
    val yard2 = Yard2()

    println(yard2.flowers)
}