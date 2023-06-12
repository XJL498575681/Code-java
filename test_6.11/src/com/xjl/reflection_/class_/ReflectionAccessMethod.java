package com.xjl.reflection_.class_;

import java.lang.reflect.Method;

public class ReflectionAccessMethod {
    public static void main(String[] args) throws Exception {

        // 1 .  获取类
        Class<?> bossCls = Class.forName("com.xjl.reflection_.class_.Boss");

        // 创建对象
        Object o = bossCls.newInstance();

        //调用 普通的方法
        Method hi = bossCls.getMethod("hi",String.class);
        Method hi1 = bossCls.getDeclaredMethod("hi",String.class);

        hi.invoke(o,"jack");


        // 调用 private static 方法
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true); // 私有 进行爆破
        System.out.println(say.invoke(o,1,"haha",'k'));
        // 因为 say 方法是static 的 还可以直接 传入 null
        System.out.println(say.invoke(null ,1,"haha",'k'));

        //在反射中 如果方法 有固定的返回值类型 统一返回为  编译类型接收是 Object  运行类型是  String
//        String  re = say.invoke(null,2,"vr",'f'); 错误 编译过不去

         System.out.println(say.invoke(null,30,"lucy",'男').getClass());

        // 调用属性


    }
}



class Boss{
    public int age;
    private  static String name;

    public Boss(){

    }

    private static String say(int n,String s,char c){
        return n + " " + s  + " " + c ;
    }

    public  void hi(String s){
        System.out.println(" hi    " + s);
    }

}
