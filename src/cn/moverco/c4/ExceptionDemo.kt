package cn.moverco.c4
//try catch 表达式
fun main(args: Array<String>) {
    val result = try {
        args[0].toInt()/args[1].toInt()
    }catch (e:Exception){
        e.printStackTrace()
        0
    }
    println(result)
}