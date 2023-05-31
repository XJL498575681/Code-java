package com.housework;

import java.util.Locale;

public class h3 {
    public static void main(String[] args) {

        String name = "XIAO jin liang ";
        printName(name);
    }

    public static void printName(String str){
        if(str == null){
            System.out.println("str 不能为空");
            return;
        }


        String [] s= str.split(" ");

        if(s.length != 3){
            System.out.println("输入的格式不对");
        }

        String format = String.format("%s,%s,%c",s[2],s[0],s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }

}
