package cn.moverco.kotlindemo.c5

class Manager : Driver, Writer {
    override fun drive() {

    }

    override fun write() {

    }
}

//class SeniorManager(val driver: Driver,val writer: Writer):Driver,Writer{
//    override fun drive() {
//        driver.drive()
//    }
//
//    override fun write() {
//        writer.write()
//    }
//}


//接口代理 关键字by
class SeniorManager(val driver: Driver, val writer: Writer) : Driver by driver, Writer by writer


class CarDriver : Driver {
    override fun drive() {
        println("Drive")
    }
}

class PPTWriter : Writer {
    override fun write() {
        println("Write")
    }
}


interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

/**
 * output:
Drive
Write
 */
fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val seniorManager = SeniorManager(driver,writer)
    seniorManager.drive()
    seniorManager.write()

}