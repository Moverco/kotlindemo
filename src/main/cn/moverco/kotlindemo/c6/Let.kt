package cn.moverco.kotlindemo.c6

data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working")
    }
}

fun main(args: Array<String>) {
    findPerson()?.let { (name, age) ->
        println(name)
        println(age)
    }
    findPerson()?.let { person -> person.work() }
    findPerson()?.apply {
        work()
        println(age)
    }



}

fun findPerson(): Person? {
    return null
}
