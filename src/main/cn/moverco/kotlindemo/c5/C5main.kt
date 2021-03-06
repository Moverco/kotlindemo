package cn.moverco.kotlindemo.c5

/**
 *         面向对象的基本概念
 *         本质上就是解决如何用程序描述世界的问题
 *         讨论如何把实际存在的东西映射成程序的类和对象
 *
 *
 *         Kotlin与java类型只支持单继承，但可以实现多个接口
 *
 *      抽象类与接口的比较
 *      ---相同---
 *      1、不能直接实例化
 *      2、有需要子类（实现类）实现的方法
 *      3、父类（接口）变量可以接受子类（实现类）的实例赋值
 *      ---不同---
 *      1、抽象类有状态，接口没有状态
 *      2、抽象类有方法实现，接口只能有无状态的默认实现
 *      3、抽象类只能单继承、接口可以多实现
 *
 *
 *      继承（实现）要点
 *      1、父类需要open才可以被继承
 *      2、父类方法、属性需要open才可以被覆写
 *      3、接口、接口方法、抽象类默认为open
 *      4、覆写父类（接口）成员需要override关键字（必须要有）
 *      5、继承类时实际上调用了父类的构造方法
 *
 *      默认参数
 *      1、为函数参数设定一个默认值
 *      2、可以为任意位置的参数设置默认值
 *      3、函数调用产生混淆时用具名参数
 *
 *      @JVMOverloads
 *
 */
