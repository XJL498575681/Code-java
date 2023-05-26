package com.xjl.abstract_.moudle;

abstract public class Template {

    public abstract void job();


    public void calculate(){
        //开始时间
        long start = System.currentTimeMillis();

        job();  //动态绑定机制  创建了什么对象进入该对象的方法里面去
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间  " + (end - start ));

    }
}
