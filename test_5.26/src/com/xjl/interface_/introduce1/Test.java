package com.xjl.interface_.introduce1;

public class Test {
    public static void main(String[] args) {

    }
}
//一个类 implements 实现接口  要将该接口的所有抽象方法都实现
class A implements Ainterface{


    @Override
    public void hi() {
        System.out.println(" hihi");
    }

}