package cn.moverco.kotlindemo.c5

import kotlin.reflect.KProperty

/**
 * 定义方法
 * --val/var <property name>:<Type> by <expression>
 *     代理者需要实现相应的setValue/getValue方法
 */
class PP {
    val hello by lazy { "hello" }
    var proxy by Proxy()

}

class Proxy {
    private var value:String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue:$thisRef->${property.name}")
        return value?:""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("setValue:$thisRef->${property.name} = $value")
        this.value
    }
}

fun main(args: Array<String>) {
    val pp = PP()
    println(pp.proxy)
    pp.proxy = "proxy"
    println(pp.proxy)
}