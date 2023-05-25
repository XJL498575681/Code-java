package com.xjl.static_.introduce;

public class Detail {
    public static void main(String[] args) {
        System.out.println(B.n2);
//        System.out.println(B.n1);


        System.out.println(C.address);
    }
}

class B{
    public int n1 =10;
    public static int n2 =1;


}

class C{
    public static String address = "北京";

}
