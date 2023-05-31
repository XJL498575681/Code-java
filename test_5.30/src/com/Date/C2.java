package com.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class C2 {
    public static void main(String[] args) {
    LocalDateTime ll = LocalDateTime.now();

        System.out.println(ll);
        System.out.println(ll.getYear());
        System.out.println(ll.getMonth());
        System.out.println(ll.getDayOfMonth());


        LocalDate dd = LocalDate.now();
        System.out.println(dd);


        //格式化日期

        DateTimeFormatter date  = DateTimeFormatter.ofPattern(
                "yyyy年MM月dd日 hh:mm:ss E");
        String format = date.format(ll);
        System.out.println(format);


        //静态方法now
        Instant now = Instant.now();
        System.out.println(now);


        Date date1 = Date.from(now);
        Instant instant = date1.toInstant();

    }
}
