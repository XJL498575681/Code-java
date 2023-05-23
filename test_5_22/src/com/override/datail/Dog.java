package com.override.datail;

public class Dog  extends Animal {
    //方法定义的形式都一样    （名称 返回值 参数）
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
    //子类的返回类型是父类
    public String  m1(){
        return null;
    }
    // 此时子类的返回类型 Object 却是 父类String 的父类 不可行
//    public Object   m2(){
//        return null;
//    }


    public AAA m(){
        return null;
    }
//    public BBB m(){
//        return null;
//    }


    //此时子类的 权限修饰符不能 缩小我们的父类 权限修饰符
//    protected void eat(){
//        System.out.println("吃饭 ");
//    }



    //可以扩大
    public  void  eat(){
        System.out.println(" 吃饭 ");
    }


}


class AAA{

}

class BBB extends AAA{

}