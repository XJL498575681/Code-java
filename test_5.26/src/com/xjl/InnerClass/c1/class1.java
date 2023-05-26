package com.xjl.InnerClass.c1;
/*
    演示局部内部类
 */
public class class1 {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.p1();

        System.out.println( "outer对象 的hashcode 地址" + outer);
    }
}
//外部类
class Outer{

    private int n1 = 100;

    public Outer() {
    }

    //构造器
    public Outer(int n1) {
        this.n1 = n1;
    }


    private  void m1(){
        System.out.println("Outer的方法");
    }

    {
        System.out.println("Outer 的代码块 ");
    }
    //
    public  void p1(){
        //内部类  本质仍然是一个类 可以直接访问外部类的所有成员 包括私有的
        final class Inner{

            //  n1 和外部类的 n1 重名 遵循就近原则
            private  int n1 = 800;
            public void f1(){
                //直接访问外部类的成员
                System.out.println("n1 = "+ n1);  //800
                //本质就是外部类的对象 即哪个对象创建了该方法 就是指向哪个对象
                System.out.println("想要访问外部类的n1 " + Outer.this.n1);  //100
                //查看外部类.this 的hashcode 地址  是否和创建的对象值相等 ？
                System.out.println("外部类Outer 的hashcode 地址"+Outer.this);
                m1();
            }
        }
//    //如果内部类未加final 修饰 本质还是具有类的性质  可以继承
//    class Inner9 extends Inner{
//
//    }
        Inner inner = new Inner();
        inner.f1();
    }


}