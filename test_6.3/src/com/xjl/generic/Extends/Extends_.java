package com.xjl.generic.Extends;

import java.util.ArrayList;
import java.util.List;

public class Extends_ {
    public static void main(String[] args) {


        ArrayList<Object> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<AA> list2 = new ArrayList<>();
        ArrayList<BB> list3 = new ArrayList<>();
        ArrayList<CC> list4 = new ArrayList<>();


        print1(list);
        print1(list1);
        print1(list2);
        print1(list3);
        print1(list4);
        /*
            //          (List<?>c)   任意类型都可以接受
    public static void  print1(List<?>c){
        for (Object o :c) {
            System.out.println(o);
        }
    }
         */

//
//        print2(list);
//        print2(list1);
        print2(list2);
        print2(list3);
        print2(list4);


        print3(list);
    //     print3(list1);  //String 类
        print3(list2);
        //print3(list3); // 子类
        //print3(list4);//   子类
    }

    //          (List<?>c)   任意类型都可以接受
    public static void  print1(List<?>c){
        for (Object o :c) {
            System.out.println(o);
        }
    }

    //        List<? extends AA>c)  上限是AA 可以接受AA 或者AA 的子类
    public static void  print2(List<? extends AA>c){
        for (Object o :c) {
            System.out.println(o);
        }
    }

    //        (List<? super  AA>c)  规定下限是 AA 支持AA或者他的父类 不限于直接父类
    public static void  print3(List<? super  AA>c){
        for (Object o :c) {
            System.out.println(o);
        }
    }
}
class AA{

}
class BB extends AA{

}

class CC extends BB{

}