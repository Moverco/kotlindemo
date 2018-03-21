package cn.moverco.kotlindemo.c6

/**
 * output:
[Ele:1, Ele:2, Ele:2, Ele:3, Ele:4, Ele:5, Ele:3, Ele:4, Ele:5, Ele:6, Ele:7]
1
2
2
3
4
5
3
4
5
6
7
42
1,2,2,3,4,5,3,4,5,6,7,
1,2,2,3,4,5,3,4,5,6,7
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val newList = list.map(Int::toLong)
    val newList2 = list.map { it * 2 }

    val list2 = listOf(1..2, 2..5, 3..7)
    val l1 = list2.flatMap {
        it.map {
            "Ele:$it"
        }
    }
    val flatList = list2.flatMap { it }

    println(l1)
    flatList.forEach(::println)

    println(flatList.reduce { acc, i -> acc + i })
    println(flatList.fold(StringBuilder()){acc,i->acc.append(i).append(",")})
    println(flatList.foldRight(StringBuilder()){i,acc->acc.append(i).append(",")})
    println(flatList.joinToString(","))

}