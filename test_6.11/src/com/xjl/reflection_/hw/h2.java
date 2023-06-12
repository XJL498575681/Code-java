package com.xjl.reflection_.hw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class h2 {
    public static void main(String[] args) throws Exception{

        Class<?> fileCls = Class.forName("java.io.File");

        // 返回所有构造器
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();

        //遍历
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor<?> declaredConstructors1 = fileCls.getDeclaredConstructor(String.class);

        String filePath = "e:\\abreba.txt";
        Object file = declaredConstructors1.newInstance(filePath);


        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);
        System.out.println(file.getClass());


    }
}
