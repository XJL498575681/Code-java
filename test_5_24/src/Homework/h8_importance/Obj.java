package Homework.h8_importance;

public class Obj {
    public static void main(String[] args) {
        A obj = new B();
        A b1 = obj;
        System.out.println("obj 的运行类型= "+obj.getClass());

        obj = new C();
        System.out.println("obj 的运行类型= "+obj.getClass());


        obj = b1;
        System.out.println("obj 的运行类型= "+obj.getClass());
    }
}
class A{

}

class B extends A{

}

class C extends B{

}