package com.extend_s.test;

public class t2 {

    public static void main(String[] args) {

        Cc cc = new Cc();
    }
}


class Aa{
    public Aa(){
        System.out.println("我是A类");// 1
    }
}
class Bb extends Aa{
    public Bb(){
        System.out.println("b的无参");
    }
    public Bb(String name){
        //super()  继承A的无参构造器
        System.out.println(name + "b的有参"); //2
    }
}

class Cc extends Bb{
    public Cc(){
        this("hello");
        System.out.println("c的无参");  // 4
    }
    public Cc(String name){
        super("hahah");
        System.out.println("c的有参"); //3
    }
}