package com.xjl.InnerClass.Anonymous;

public class Exercise1 {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        System.out.println();
        //匿名内部类

        cellPhone.clock(new Bell() {
            /*  此时 编译时Bell    运行是匿名内部类
       new Bell() {
           @Override   动态绑定机制重写了ring方法
           public void ring() {
                System.out.println("懒猪起床了");
           }
       }
        */
            @Override
            public void ring() {
                 System.out.println("懒猪起床了");
            }
        });
        cellPhone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });


    }
}

interface Bell{
    void ring();
}


class CellPhone{
    public void clock(Bell bell){  //相应的动态绑定机制
        System.out.println(bell.getClass());
        bell.ring();
    }
}