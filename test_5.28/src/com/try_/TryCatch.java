package com.try_;



public class TryCatch {

    public static void main(String[] args) {
        try {
            String str = "吃你的女";
            int a = Integer.parseInt(str);
            System.out.println("数字 a " + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息");;
        }finally{
            System.out.println("++++++");
        }

        System.out.println("程序继续");
    }

}
