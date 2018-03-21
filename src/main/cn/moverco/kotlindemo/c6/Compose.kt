package cn.moverco.kotlindemo.c6

/**
 * 函数复合
 *   infix中缀表达式
 */
val add={i:Int->i+1}
val multiply = {i:Int->i*2}

infix fun <P1,P2,R> Function1<P1,P2>.andThen(function: Function1<P2,R>):Function1<P1,R>{
    return fun (p1:P1):R{
        return function.invoke(this.invoke(p1))
    }
}

infix fun <P1,P2,R> Function1<P2,R>.compose(function: Function1<P1,P2>):Function1<P1,R>{
    return fun (p1:P1):R{
        return this.invoke(function.invoke(p1))
    }
}

fun main(args: Array<String>) {
    //(2+1)*2=6
    val function = add andThen multiply
    println(function(2))
    //2*2+1=5
    val function2 = add compose multiply
    println(function2(2))
}