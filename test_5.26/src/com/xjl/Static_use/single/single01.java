package com.xjl.Static_use.single;
/*
   懒汉模式
 */
public class single01 {

    public static void main(String[] args) {

        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        System.out.println(instance == instance1);
        // System.out.println(Cat.n1);

        //此时
    }
}


//只创建一个对象

class Cat{

    private String name;
    public static int n1 = 999;
    //2.定义静态属性
    private static Cat cat;

    //1 私有化构造器
    private  Cat(String name) {
        System.out.println("构造器调用 == ===");
        this.name = name;
    }


    //3.提供public static调用方法 用于返回对象
    //只有用户调用getInstance 才会返回对象
    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("小猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}