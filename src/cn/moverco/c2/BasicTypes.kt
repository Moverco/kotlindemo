package cn.moverco.c2

// kotlin中Boolean大多数情况下相当于JAVA中的boolean
// 只有在某些情况下才会被装箱成Boolean包装类
val aBoolean: Boolean = true
val bBoolean: Boolean = false

//数字类型
// Double 64bit
// Float 32bit
// Long 64bit
// Int 32bit
// Short 16bit
// Byte 8bit
val aDouble: Double = 3.1415
val aFloat: Float = 3.14f
val aInt: Int = 8
val bInt: Int = 0xFF
val cInt: Int = Int.MAX_VALUE
val dInt: Int = 0b0000111


val bFloat: Float = Float.MAX_VALUE
val cFloat: Float = Float.POSITIVE_INFINITY
//false
val cBoolean: Boolean = ((0.0F / 0.0F) == Float.NaN)

//Char
//16bit Unicode
/**
转义字符
\t  制表符
\b  光标后退一个字符
\n  回车
\r  光标回到行首
\'  单引号
\"  双引号
\\  反斜杠
\$  美元符号
 */

val aChar: Char = '0'
val bChar: Char = '北'
val cChar: Char = '\u000f'

/**
基本类型的转换
不可隐式转换

 *
 */

val str: String = "abcd"
val str2: String = String(charArrayOf('a', 'b', 'c', 'd'))
val b1: Boolean = (str == str2)//true
val b2: Boolean = (str === str2)//false
//字符串的拼接
val str3: String = "" + aInt + "+" + bInt+"="+(aInt+ bInt)
val str4:String ="$aInt+$bInt=${aInt+ bInt}"
val str5:String="""
    原始字符串 支持任意格式字符 \$ 除外 $ 转义无法使用
    """



