package cn.moverco.kotlindemo.c4

private const val USERNAME = "milton"
private const val PASSWD = "milton"

private const val ADMIN_NAME = "admin"
private const val ADMIN_PASSWD = "admin"

private const val DEBUG = 0
private const val USER = 1


fun main(args: Array<String>) {


    //1.使用when语句实现

    val mode = when{
        args.isNotEmpty()&&args[0].toInt()== DEBUG -> DEBUG
        else -> USER
    }

    //2.使用if语句实现
    val mode1 = if (args.isNotEmpty()&&args[0].toInt()== DEBUG){
        DEBUG
    }else{
        USER
    }

    println("pls enter ur username")
    val username = readLine()
    println("pls enter ur passwd")
    val passwd = readLine()

    if (mode== DEBUG&&username== ADMIN_NAME&&passwd== ADMIN_PASSWD){
        println("Admin mode log in success")
    }else if (username== USERNAME&&passwd== PASSWD){
        println("user log in success")
    }else{
        println("log in failed")
    }
}