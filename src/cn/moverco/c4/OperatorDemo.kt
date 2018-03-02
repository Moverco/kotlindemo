package cn.moverco.c4

/**
 * 基本运算符
 * 1.任何类都可以定义后者重载父类的基本运算符
 * 2.通过运算符对应的具名函数来定义
 * 3.对参数个数作要求，对参数和返回值类型不作要求
 * 4.不能像Scala一样定义任意运算符
 *
 */
class Complex(var real:Double,var imaginary:Double){
    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real,imaginary+other.imaginary)
    }
    operator fun plus(i:Number):Complex{
        return Complex(real+i.toDouble(),imaginary)
    }
    operator fun invoke():Double{
        return Math.hypot(real,imaginary)
    }

    override fun toString(): String {
        return "$real+${imaginary}i"
    }

    /**
     * sample  (A newop B)
     * * 中缀表达式
     * 只有一个参数,且用infix修饰的函数
     */
    infix fun newop(any:Any):Boolean{
        return false
    }
}

/**
 * output:
6.4+8.5i
6.4+8.5i
203.0+4.0i
5.0

 */
fun main(args: Array<String>) {
    val c1 = Complex(3.0,4.0)
    val c2 = Complex(3.4,4.5)
    println(c1.plus(c2))
    println(c1+c2)
    println(c1+200)
    println(c1())
}