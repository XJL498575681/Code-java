package com.Date;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;

public class Calender_ {
    public static void main(String[] args) {
        //抽象类  构造器private get set 方法

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println(c.get(Calendar.YEAR) +"年" + (c.get(Calendar.MONTH) + 1) +"月"
        + c.get(Calendar.DAY_OF_MONTH) + "日"  + c.get(Calendar.HOUR)  +"时" +
                c.get(Calendar.MINUTE) + "分" );

        //日期需要自己组合  没有固定格式
    }
}
