package com.xjl.Object_.Finalize;

public class finalize {
    public static void main(String[] args) {

        Car bmw = new Car("宝马");
        //此时就是一个垃圾 销毁前 调用finalilze
        /*
        如果不进行重写 默认调用Object 里面的finalize 做默认处理
        进行了重写就实现自己的逻辑
         */
        bmw = null;

        System.gc();  //主动调用垃圾回收
        System.out.println("程序退出");
    }
}


class Car{

    private String name;
    public Car(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
        System.out.println("释放空间");
    }
}