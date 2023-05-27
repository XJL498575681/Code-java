package com.xjl.Enum.method;


public class Enum3 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);


    }
}

enum Season2{


//常量对象在最前面
    SPRING("春天", "万物复苏"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "寒风刺骨");



    private String name;
    private String desc;

//    public static final Season spring = new Season1("春天", "万物复苏");
//    public static final Season summer = new Season1("夏天", "烈日炎炎");
//    public static final Season autumn = new Season1("秋天", "秋高气爽");
//    public static final Season winter = new Season1("冬天", "寒风刺骨");


    private  Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}