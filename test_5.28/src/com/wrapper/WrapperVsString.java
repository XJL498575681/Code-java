package com.wrapper;

public class WrapperVsString {
    public static void main(String[] args) {
        //包装类 -》 String
        Integer i = 100;

        //方式一
        String str1 = i + "";
        System.out.println(str1);
        //方式二
        String str2 =i.toString();
        System.out.println(str2);
        //方式三
        String str3 = String.valueOf(i);
        System.out.println(str2);

        //  String  -》  包装类

        String str4 = "12345";
        /*
        先将包装类转换成基本数据类型 基本数据类型会自动装箱

         */

        //方式一
        Integer i2 = Integer.parseInt(str4);
        //方式二
        Integer i3 = new Integer(str4);


    }
}
