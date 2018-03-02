package cn.moverco.kotlindemo.c2;

public class TypeCast {
    public static void main(String... args){
        Parent parent = new Child();
        if (parent instanceof Child){
            System.out.println(((Child) parent).getName());
        }
    }
}
