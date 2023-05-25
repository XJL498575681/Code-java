package com.xjl.codeblock.datail;

public class Detail {
    public static void main(String[] args) {

        //1 创建对象时
       // A a = new A();

        // 2创建子类对象实例   先执行父类的代码块 后执行子类的代码块  类的继承 先加载父类 后加载子类

       // B b = new B();

        // 3. 使用类的静态成员（属性  方法 ）
       // System.out.println(Cat.n1);

        //静态代码块只执行一次 static代码块 实在类加载的时候 执行的 且只执行一次
//        Dog dog = new Dog();
//        Dog dog1 = new Dog();


        //普通代码块  随着对象的创建而加载
//        Dog dog = new Dog();
//        Dog dog1 = new Dog();

        //只是使用类的静态成员时 并未创建对象 普通代码块并 不会被执行  和类加载无关

        //可以简单理解  普通代码块是构造器的补充
        System.out.println(Dog.n1);

    }
}

class Dog{

    public static int n1 =10;
    //静态代码块
    static {
        System.out.println("Dog 的静态代码块被执行");
    }
    //普通代码块
    {
        System.out.println("Dog 的普通代码块");
    }
}

class Animal{

    static{
        System.out.println("Animal 的静态代码块");
    }
}


class Cat extends Animal{
    public static int n1= 99;

    static{
        System.out.println("Cat 的静态代码块");
    }
}


class A{

    //静态代码块
    static{
        System.out.println("A 静态代码块执行");
    }
}
class B extends A{
    static{
        System.out.println("B 静态代码块执行");
    }
}