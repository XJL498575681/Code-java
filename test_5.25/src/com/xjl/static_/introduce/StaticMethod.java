package com.xjl.static_.introduce;

public class StaticMethod {
    public static void main(String[] args) {

        Stu tom = new Stu("tom");
        tom.payFee(100);

        Stu jack = new Stu("jack");
        jack.payFee(200);

        Stu.showFee();
        jack.showFee();


        System.out.println(MyTools.sum(1,2));
    }
}
//static 工具类方法    类.方法名
class MyTools{

    public static double sum(double a,double b){
       return (a + b);
    }

}


class Stu{
    private String name;

   private  static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //静态方法访问静态变量
    public static   void payFee(double fee){
        Stu.fee += fee;
    }
    public static void showFee(){
        System.out.println("总学费" + Stu.fee);
    }
}