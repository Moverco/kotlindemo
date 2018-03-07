package cn.moverco.kotlindemo.c5

class Person1(val age:Int,val name:String)
@Bean
data class Person2(val age:Int,val name:String)

/**
 * data class 默认实现 copy toString等方法
 *
 * allOpen noArg插件
 */
fun main(args: Array<String>) {
    val person1 = Person1(20,"Tom")
    val person2 = Person2(25,"Milton")
    println(person1)
    println(person2)

}