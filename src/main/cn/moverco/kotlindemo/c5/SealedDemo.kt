package cn.moverco.kotlindemo.c5

/**
 * 子类可数
 *  1.1版本之前，子类必须定义为密封类的内部类
 *  1.1版本之后，子类只需要与密封类在同一个文件中
 *
 *  枚举为实例可数
 */
sealed class Player1{
    class Play(val url:String,val position:Long = 1):Player1()
    class Seek(val position: Long):Player1()
    object Pause:Player1()
    object Resume:Player1()
    object Stop:Player1()

}