package com.xjl.InnerClass.member;

public class Member1 {
    public static void main(String[] args) {


        Outer outer = new Outer();
        outer.show();


        //外部其他类 使用成员内部类的三中方式
        //1.想要new Inner  但是是在outer 对象下的
        Outer.Inner inner = outer.new Inner();
        inner.say();
        //2.编写一个方法 返回Inner

        Outer.Inner inner1 = outer.get();
        inner1.say();


    }
}

class Outer{ //外部类
    private int n1 = 10;
    public String name = "张三";
    private void play(){
        System.out.println("玩游戏");
    }

    //内部类  直接使用 外部类的属性   方法
    public class Inner{
        private int n1  = 999;

        private  int qq = 100;
        public void say(){
            play();
            System.out.println(name + "  " +n1  + "   " + Outer.this.n1);
        }

    }

    //通过方法 在Inner类返回一个Inner 实例
    public Inner get(){
        return new Inner();
    }

    //使用成员内部类
    // 创建成员内部类的对象  然后调用内部类相关的属性 或者方法
    public void show(){
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.qq);
    }

}


