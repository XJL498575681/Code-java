package com.ploy.exercise;

public class Exercise1 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); // 20
        s.display(); //20
        Base b = s;  //上转型
        System.out.println(b == s);  //T
        System.out.println(b.count); //看编译 b  10
        b.display();  // 看运行 20
    }
}

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}