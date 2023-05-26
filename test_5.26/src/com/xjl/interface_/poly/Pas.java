package com.xjl.interface_.poly;

/*
多态传递现象
 */
public class Pas {
    public static void main(String[] args) {
//接口类型的变量可以指向 实现了该接口的类的对象实例
        IG ig = new Teacher();

        // 此时的Teacher 并未实现 IG接口  如果改为IG 是要继承 IH 的接口
        //
        IH ih = new Teacher();

    }
}

interface  IH{
    void hi();
}

interface IG extends IH{}

class Teacher implements IG{
    @Override
    public void hi() {
        System.out.println("多态传递机制");
    }
}