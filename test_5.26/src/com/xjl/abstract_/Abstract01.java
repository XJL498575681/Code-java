package com.xjl.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
        private String name;

    public Animal(String name) {
        this.name = name;
    }

    //父类方法不确定性   -》 改为抽象方法   -》 方法变成了抽象方法， 类也得变成抽象类
    // 会被继承 让其子类实现

//    public void eat(){
//        System.out.println("不知道吃啥");
//    }
    public abstract  void eat();
}