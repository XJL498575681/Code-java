package com.homework;

public class h4 {
    public static void main(String[] args) {

        C c = new C();
        c.f1();



    }
}


class C{

    private final String name = "jack";

    public void  f1(){
        class D{
            private final String name = "lucy";

            public void show(){
                System.out.println("内部类"+name + "外部类"+ C.this.name);
            }
        }
        D d = new D();
        d.show();
    }

}