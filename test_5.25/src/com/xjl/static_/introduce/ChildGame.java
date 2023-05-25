package com.xjl.static_.introduce;

public class ChildGame {
    public static void main(String[] args) {
//        int  count = 0;
//        /*
//        此时的count 独立于对象的  属性未在Child  访问count 困难
//         */

        Child jack = new Child("jack");
        jack.play();
        jack.count ++ ;
        Child lucy = new Child("lucy");
        lucy.play();
        lucy.count ++;
        Child june = new Child("june");
        june.play();
        june.count ++;

        System.out.println(Child.count + "加入了游戏");
    }
}




class Child{
    private String name;

    //定义静态变量
    public  static int count = 0;
    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println(getName() + " 加入了游戏");
    }
}