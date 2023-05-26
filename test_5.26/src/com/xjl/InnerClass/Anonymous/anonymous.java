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

    }
}

interface A{
    public void cry();
}

//class Tiger implements A{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤+++");
//    }
//}

class Father{
    public Father(String name){
        super();
    }
    public void test(){

    }
}