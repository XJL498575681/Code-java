package com.StringBuffer_;

public class zhuanhuan {
    public static void main(String[] args) {


        //String -> StringBuffer
        //方式一  构造器
        String str = "abvfds";

        StringBuffer stringBuffer = new StringBuffer(str);


        //方式二   使用append
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer append = stringBuffer1.append(str);




        // StringBuffer   ->   String
        // 方式一
        StringBuffer stringBuffer2 = new StringBuffer("新中国");
        String s  = stringBuffer2.toString();


        //二 构造器
        String s1 = new String(stringBuffer2);

    }
}
