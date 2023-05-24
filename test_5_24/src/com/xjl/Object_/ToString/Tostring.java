package com.xjl.Object_.ToString;

public class Tostring {
    public static void main(String[] args) {
        Monster monster = new Monster("猫妖", "吃人",100);

        System.out.println(monster.toString());
        System.out.println(monster.hashCode());

    }
}


class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}


/*

    Object 的toString
    public String toString() {
(1)getclass().getName()类的全类名(包名+类名)
(2)Integer.toHexString(hashCode())将对象的hashCode值转成16进制字符串

        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 */
