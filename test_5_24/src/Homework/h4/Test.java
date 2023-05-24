package Homework.h4;

public class Test {
    public static void main(String[] args) {

        new Demo().test();
        new Demo("john").test();
    }
}


class Work{
    String name = "Rose";
    Work(){
        System.out.println("Work");  // 1
    }
    Work(String name){
        this.name =name;    //此时传进来的实参 代替了Rose  是joho
    }
}

class Demo extends Work{
    String name = "jack";
    Demo(){
       // super();
        System.out.println(" Demo");  // 2
    }
    Demo (String s){
        super(s);
    }
    public void test(){
        System.out.println(super.name);   //3 Rose    父类的name =  5 joho
        System.out.println(this.name);  // 4  jack       6 jack
    }
}