package com.xjl.Enum.introduce;
/*

枚举
1.私有化构造器 不允许new
2.去掉setXXX方法 防止属性被修改
3.固定对象
 */
public class Enum2 {
    public static void main(String[] args) {

        System.out.println(Season.spring);

    }
}

class Season{
    private String name;
    private String desc;



    public static final Season spring = new Season("春天", "万物复苏");
    public static final Season summer = new Season("夏天", "烈日炎炎");
    public static final Season autumn = new Season("秋天", "秋高气爽");
    public static final Season winter = new Season("冬天", "寒风刺骨");



    private  Season(String name, String desc) {
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
