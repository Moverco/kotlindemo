package cn.moverco.c2

fun getName():String{
    return "milton"//不会出现空指针异常
}
fun getName1():String?{
    return null//返回类型后加问号表示可返回空
}

/**
 * output:
6
null
8
 */
fun main(args: Array<String>) {
    println(getName().length)
    println(getName1()?.length)

    /**
     *
    val name:String = getName1()?:return //当取值为空时 操作无效
     * 等价于
    val name1 = getName1()
    if (name1 == null) return
     */

    val value:String?="not null"
    println(value!!.length)//保证不为null 两个感叹号


}