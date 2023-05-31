package com.housework;

public class h2 {
    public static void main(String[] args) {

        String name= "jack";
        String pwd = "123456";
        String email = "778@qq.com";
        try {
            register(name,pwd,email);
            System.out.println("注册成功");

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }

    public static void register(String name ,String pwd,String email){

        if(!(name != null && pwd != null && email != null )){
            throw new RuntimeException("参数不能为空");
        }
        int len = name.length();

        if(!(len >= 2 && len <= 4)){
            throw   new RuntimeException("名字不正确");
        }
        if(!(pwd.length() == 6 && isDigital(pwd) )){
            throw new RuntimeException("密码长度不对，且要求全数字");
        }
        int index1 = email.indexOf('@');
        int index2 = email.indexOf('.');
        if(!(index1 > 0 && index2 > index1)){
            throw new RuntimeException("邮箱异常");
        }



    }
    public static boolean isDigital(String str){

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if(chars[i] <'0' || chars[i] >'9'){
                return false;
            }
        }
        return true;
    }



}
