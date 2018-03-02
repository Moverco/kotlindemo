package cn.moverco.c2;

public class NullUnSafe {
    public static void main(String... args){
        System.out.println(getName().length());//有可能会有空指针异常
    }
    public static String getName(){
        return null;
    }
}
