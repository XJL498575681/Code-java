package com.xjl.generic.interface_;

public class interface1 {
    public static void main(String[] args) {

    }
}
interface IUsb<U,R> {

    //普通方法中，可以使用接口泛型Rgel (u u);
    void hi(R r);

    void run(R r1,R r2,U u1,U u2);

    //在jdlk8中，可以在接口中，使用默认方法

     default R method(U u) {
         return null;
    }
}
