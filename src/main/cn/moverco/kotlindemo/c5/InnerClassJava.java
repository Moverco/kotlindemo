package cn.moverco.kotlindemo.c5;

public class InnerClassJava {
    public class Inner{}
    public static class StaticInner{}
    public static void main(String...args){
        InnerClassJava innerClassJava = new InnerClassJava();
        Inner inner = innerClassJava.new Inner();

        StaticInner staticInner = new StaticInner();
    }
}
