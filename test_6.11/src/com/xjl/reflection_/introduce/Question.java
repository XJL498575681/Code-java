package com.xjl.reflection_.introduce;



import java.io.FileInputStream;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


@SuppressWarnings({"all"})
public class Question {
    public static void main(String[] args) throws Exception, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

//        Cat cat = new Cat();  传统方法 需要新建一个对象 然后调用方法
//        cat.hi();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString(); // 路径
        //此时是一个字符串  new 毫无意义 还是不能得到Cat对象

        String  methodName = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println( methodName);

        //  开闭原则

        // 使用反射机制 解决问题

        //1. 加载类 返回Class类型的对象 cls
        Class cls = Class.forName(classfullpath);

        // 2.通过class 返回加载得到的类 class com.xjl.relection.introduce.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println(o.getClass());  // 运行类型是Cat

        // 3.本质是想要通过 properties 的method 方法调用 我们的Cat里面的方法
        //  在反射机制中 把方法视为对象 体现万物皆可对象

        Method method1 = cls.getMethod(methodName);


        //4 通过方法对象调用方法 方法对象.对象实例  方法.invoke(对象)
        System.out.println("+++++++++++++");
       method1.invoke(o);



       // 应用方法
        // java.lang.reflect.Filed 代表类的成员变量  Filed 代表某个类的成员变量
        //getFiled 不能得到 私有的属性
        Field ageFiled = cls.getField("age");
        System.out.println(ageFiled.get(o));

        //构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        //String.class 就是String类 的Class 对象
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);


    }
}
