package cn.moverco.kotlindemo.c2

/**
 * 任意类型都有可空和不可空两种
 * val notNull:String = null //false
 * val nullable:String? = null //true
 * notNull.length //true
 * nullable.length //false
 * nullable!!.length //true 强制认定nullable不为空
 * nullable?.length //true  若nullable为空，返回空
 */
/**
 * Java风格的类型转换
 * val sub:SubClass = parent as SubClass
 * 类似于Java的类型转换，失败则抛异常
 *
 * 安全类型转换
 * val sub:SubClass?=parent as?SubClass
 * 如果转换失败，返回null，不抛异常
 *
 * 只能类型转换
 * if(parent is SubClass) parent.<子类的成员>
 *     编译器尽可能的推导类型，远离无用的类型转换
 *     if(nullable!=null) nullable.length //true
 */
/**
 * output:
Child
8
 */
fun main(args: Array<String>) {
    val parent: Parent = Child()
    if (parent is Child) {
        println(parent.name)//相比于java不需要进行强制转换
    }

    val child: Child? = parent as Child //parent as? CHild 安全的强制转换


    val str: String? = "not null"
    if (str is String) {
        println(str.length)
    }
}