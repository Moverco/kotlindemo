package cn.moverco.kotlindemo.c4

/**
 * 属性：类范围内的变量
 * 方法：类范围内的函数
 *
 * 属性初始化
 * 1.属性的初始化尽量在构造方法中完成
 * 2.无法再构造方法中初始化，尝试降级为局部变量
 * 3.var用lateinit延迟初始化，val用lazy
 * 4.可空；类型谨慎用null直接初始化
 */
class T
class Boy(var name: String, var age: Int) {
    var x = 1
        get() {
            println("get")
            return field
        }
        set(value) {
            println("set")
            field = value
        }
    protected var y = 1
        private set
    //使用lateinit关键字可以延迟初始化，并且lateinit关键字只能用在var上，不能用于val
    lateinit var z:String
    //使用lazy关键字实现val的延迟初始化
    val m:T by lazy {
        println("init m")
        T()
    }
    fun say() {
        println("name is $name")
    }

    fun say2() {
        println("age is $age")
    }
}

/**
 * output:
name is Milton
age is 25
get
1
init m
cn.moverco.c4.T@6576fe71
 */
fun main(args: Array<String>) {
    val boyDemo: Boy = Boy("Milton", 25)
    boyDemo.say()
    boyDemo.say2()
    println(boyDemo.x)
    println(boyDemo.m)
}