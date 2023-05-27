package com.xjl.InnerClass.Anonymous;

/*
匿名对象  的介绍
 */
public class anonymous {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.method();
    }
}

class Outer{
    private int n1 = 100;

    public void method(){
        /*
        基于接口的匿名内部类
        传统实现接口  写一个类 实现接口 并创建对象
        假设只使用一次 用内部类进行简化
         */
//        A tiger = new Tiger();
//        tiger.cry();

        A tiger = new A() {

            @Override
            public void cry() {
                System.out.println("老虎在叫 ");
            }
        };

        System.out.println("tiger 的运行类型是"+ tiger.getClass());
       // System.out.println("gog 的运行类型是"+ dog.getClass());
        tiger.cry();
        /*
        我们看底层   会分配类名    Outer04$1-- 匿名类名称是底层创建的 并且只能创建一次
        class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤..。");
                    }
            }
        jdk底层在创建匿名内部类Outer04$1,立即马上就创建了Outer04$1实例，
        并且把地址//返回给tiger
            匿名内部类使用一次

         */


        //类的匿名内部类
        /*
        编译类型 Father  运行类型  基于后面匿名内部类的形式
        class Outer$2  extends Father{
         @Override
            public void test() {
                System.out.println("匿名内部类重写了test");
            }
        }
         */

        Father jack = new Father("jack"){

            // jack 形参参数列表会传给我们的构造器
            // 普通类的匿名内部类 不一定要将原来类的所有方法都实现
            // 底层是根据你创建内部类的形式进而创建内部类的实例对象
            @Override
            public void test() {
                System.out.println("匿名内部jack类重写了test");
            }
        };

        jack.test();

        new Father("lucy"){

            @Override
            public void test() {
                System.out.println("Father 中的私有属性 n1" + n1);
                System.out.println("匿名内部lucy类重写了test");
            }
        }.sing("好日子");

        System.out.println("jack的运行类型"+jack.getClass());


        //基于抽象类的匿名内部类   必须要实现原来类的所有抽象方法
        //
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}

interface A{
    public void cry();
}

// //传统实现接口  写一个类 实现接口 并创建对象
//class Tiger implements A{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤+++");
//    }
//}

class Father{
    private  int n1 = 100;
    public Father(String name){
        System.out.println("接受到的name" + name);
    }
    public void test(){

    }
    public void sing(String name){
        System.out.println("sing" + name);
    }
}

//抽象类
abstract class Animal{
    abstract void eat();
}