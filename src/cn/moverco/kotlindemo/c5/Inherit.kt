package cn.moverco.kotlindemo.c5

abstract class Person(open val age:Int) {
    abstract fun work()
}


class Coder (age: Int): Person(age) {
    override val age: Int
    get() = 1
    override fun work() {
        println("Coding")
    }
}

class Doctor (age: Int): Person(age) {
    override fun work() {
        println("....")
    }
}

fun main(args: Array<String>) {
    val person:Person = Coder(11)
    person.work()
    println(person.age)

    val person2:Doctor = Doctor(12)
    person.work()
    println(person2.age)
}