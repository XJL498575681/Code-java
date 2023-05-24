package com.xjl.Object_.hash;

public class HashCode {
    public static void main(String[] args) {
        AA a =new AA();
        AA b = new AA();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        AA c = a;
        System.out.println(c.hashCode());
    }


}


class AA{

}