package com.xjl.generic.custom;

public class Custom {
    public static void main(String[] args) {


    }
}


class Tiger<T,R,M>{
    String name;
    R r;
    T t;  // 属性使用泛型
    M m;

    public Tiger(String name, R r, T t, M m) {
        this.name = name;
        this.r = r;  // 构造器使用泛型
        this.t = t;
        this.m = m;
    }

    //方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {  // 返回泛型
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
