package com.xjl.interface_.poly;

public class Ploy {
    public static void main(String[] args) {

// 接口多态的体现 接口类型的变量 if01  可以指向实现了IF 接口类的对象实例
        IF if01 = new Monster();
        if01 = new Car();

        //继承多态的体现 父类类型得到变量a 可以指向继承A的子类对象实例
        A a = new B();
        a = new C();
    }
}

interface IF{

}

class Monster implements IF{

}

class Car implements IF{

}

class  A{

}
class B extends A{}

class C extends A{}