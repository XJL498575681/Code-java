package com.xjl.InnerClass.Anonymous;

public class Exercise {
    public static void main(String[] args) {

        // 实参直接传递 简洁高效
        f1(new AI() {
            @Override
            public void show() {
                System.out.println("实参直接传递");
            }
        });

        //传统方法

        AI  a = new C();
        Exercise exercise = new Exercise();
        exercise.f1(a);

        //f1(new C());

    }

    public static void f1(AI ai){
        ai.show();
    }

}
interface AI{
    void show();
}
// 类 实现AI 编程领域 （硬编码)
class C implements AI{
    @Override
    public void show() {
        System.out.println("传参");
    }

}