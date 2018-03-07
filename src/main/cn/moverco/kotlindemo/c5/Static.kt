package cn.moverco.kotlindemo.c5

/**
 * 伴生对象与静态成员
 * 1、每个类可以对应一个伴生对象
 * 2、伴生对象的成员全局独一份
 * 3、伴生对象的成员类似Java的静态成员
 * 4、静态成员考虑用包级函数、变量替代
 * 5、JVMField和JVMStatic的使用
 */

class StaticKt private constructor(var int: Int) {
    companion object {
        fun ofInt(int: Int): StaticKt {
            return StaticKt(int)
        }

        @JvmStatic
        fun ofInt2(int: Int): StaticKt {
            return StaticKt(int)
        }

        var TAG = "STATIC TAG"
        @JvmField
        var TAG2 = "STATIC TAG"
    }
}