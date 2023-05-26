package com.xjl.Static_use.single;

/*
    饿汉模式
 */
public class single {

    public static void main(String[] args) {

        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
//        System.out.println(GirlFriend.n2);

    }
}


class GirlFriend{
//    public static int n2 = 99;
    private String name;
    //2.在类内部直接创建一个对象

    //此对象随着类的加载而创建 即使不使用也会创建  此时如果使用该对象 调用另外的static 属性 n2 变量
    //该对象也会创建  空参构造器就会实现
    //重量级对象  资源浪费
    private static GirlFriend gf = new GirlFriend("小红");

//1 构造器私有化
    private GirlFriend(String name){
        //
        System.out.println("构造器被调用+++++");
        this.name = name;
    }
    //3.提供一个公共的static方法 返回对象
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}