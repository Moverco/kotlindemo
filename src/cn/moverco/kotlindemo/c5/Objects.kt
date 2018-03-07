package cn.moverco.kotlindemo.c5


interface Player {
    fun resume()
}

/**
 * object 关键字  Kotlin中单例的实现方式
 *
 * 只有一个实例的类
 * 不能自定义构造方法
 * 可以实现接口、继承父类
 * 本质上就是单例模式最基本的实现
 */
object MusicPlayer : Player {
    override fun resume() {

    }

    val state: Int = 1

    fun play(url: String) {

    }

    fun stop() {

    }
}