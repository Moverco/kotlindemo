package cn.moverco.c4

/**
 * 跳过当前循环用continue
 * 终止循环用break
 * 多层循环嵌套的终止结合标签使用
 */
fun main(args: Array<String>) {
    for (arg in args){
        println(arg)
    }
    for ((index,value)in args.withIndex()){
        println("$index->$value")
    }
}