package com.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D1 {
    public static void main(String[] args) throws ParseException {
        //获取当前时间
        Date date = new Date();
        System.out.println(date);



        //格式转换
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);



        //格式化的字符串 -》 Date
        String s = "2023年05月31日 09:28:18 星期三";
        Date parse= simpleDateFormat.parse(s);
        System.out.println(parse);
    }
}
