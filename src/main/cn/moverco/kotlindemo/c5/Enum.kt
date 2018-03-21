package cn.moverco.kotlindemo.c5

enum class EnumDemo(val id:Int){
    PLAY(1),PAUSE(2),RESUME(3),STOP(4),DELETE(5);
    fun getId():String{
        return "$id,$name"
    }
}

class EnumDemo2 protected constructor(){
    val PLAY = EnumDemo2()
    val PAUSE = EnumDemo2()
    val RESUME = EnumDemo2()
    val STOP = EnumDemo2()
    val DELETE = EnumDemo2()
}

/**
 * 实例可数的类
 * 可以修改构造，添加成员
 * 可以提升代码的表现力，但会带来一定的性能开销
 *
 * output:
1,PLAY
PLAY
PAUSE
RESUME
STOP
DELETE
 */
fun main(args: Array<String>) {

    println(EnumDemo.PLAY.getId())
    EnumDemo.values().map (::println)
}