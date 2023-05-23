package com.ploy.Detail_up;

public class Poly {
    public static void main(String[] args) {
        //向上转型   父类 引用名 = new  子类
         Animal animal = new Cat();
         animal.eat();
         //多重父类
          Object obj = new Cat();

          //可以调用父类所父类的所有成员 （在遵守权限修饰符的前提下  但是不能调用子类所特有的方法)
        animal.run();
        //编译的是 Animal
//        animal.catch();

        //向下转型   子类 引用名 = （子类） 父类引用

        //此时编译类型是Cat  运行还是Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();
        cat.run();



        //ClassCastException    类型转换异常
     // Dog dog = (Dog)animal;






    }
}
