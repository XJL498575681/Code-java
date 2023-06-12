package com.xjl.reflection_.class_;

public class Class1 {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
        传统 new
            public Class<?> loadClass(String name) throws ClassNotFoundException {
        return loadClass(name, false);
    }
         */
      //  Cat cat = new Cat();


        Class<?> cls = Class.forName("com.xjl.reflection_.introduce.Cat");

        /*
            public Class<?> loadClass(String name) throws ClassNotFoundException {
        return loadClass(name, false);
    }
         */
    }
}
