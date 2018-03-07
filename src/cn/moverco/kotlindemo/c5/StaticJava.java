package cn.moverco.kotlindemo.c5;

/**
 * output:
 STATIC TAG
 STATIC TAG
 */
public class StaticJava {
    public static void main(String[] args) {
        StaticKt staticKt = StaticKt.Companion.ofInt(1);
        StaticKt.ofInt2(2);
        System.out.println(StaticKt.Companion.getTAG());
        System.out.println(StaticKt.TAG2);
    }
}
