package com.xjl.Enum.introduce;

public class Exercise {
    public static void main(String[] args) {

        Week[] w1 =Week.values();
        for (Week week: w1){

            System.out.println(week);
        }
    }
}

enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}