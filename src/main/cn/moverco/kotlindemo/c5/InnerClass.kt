package cn.moverco.kotlindemo.c5

open class Outter{
    val a:Int = 1
    class StaticInner{

    }
    inner class Inner{
        val a:Int = 2
        fun print(){
            println(a)
            println(this@Outter.a)
        }
    }
}

interface OnClickListener{
    fun onCLick()
}
class View{
    var onClickListener:OnClickListener?=null

}

/**
 * Kotlin中 内部类默认为静态内部类，使用inner关键字修饰可以将其改为非静态内部类
 *
 * 匿名内部类
 *  没有定义名字的内部类
 *  类名编译时生成
 *  可以继承父类、实现多个接口，与Java注意区别
 */
fun main(args: Array<String>) {
    val inner = Outter.StaticInner()

    val view:View = View()
    view.onClickListener = object :Outter(),OnClickListener{
        override fun onCLick() {

        }
    }
}