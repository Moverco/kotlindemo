package cn.moverco.kotlindemo.c6

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
   readFile("file.txt")

}

fun readFile(fileName:String){
    val br = BufferedReader(FileReader(fileName))
    with(br){
        var line:String?
        while (true){
            line = readLine()?:break
            println(line)
        }
        close()
    }
}

fun readFile2(fileName: String){
    val br = BufferedReader(FileReader(fileName)).readText()
}

fun readFile3(fileName: String){
    val br = BufferedReader(FileReader(fileName)).use {
        var line:String?
        while (true){
            line = it.readLine()?:break
            println(line)
        }
    }

}