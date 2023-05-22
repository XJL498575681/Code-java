package com.encapsulation;

public class Encap {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("jackjack");
        p1.setAge(19);
        p1.setSalary(15000);
        System.out.println(p1.info());

        System.out.println();

        Person smith = new Person("smith", 2000, 13000);
        System.out.println( smith.info());

    }
}

class   Person{
    public String name;//公开
    private int age; // 私有
    private double salary;




    //构造器


    public Person() {
    }
//构造器跳过自定义的防护机制
//    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }


    public Person(String name, int age, double salary) {
        setSalary(salary);
        setAge(age);
        setName(name);

    }

    public void setName(String name){
        if(name.length() >2 && name.length() <6 ){
            this.name = name;
        }else{
           // System.out.println("名字必须在2-6");
            this.name = "null";
        }

    }
    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age < 120) {
            this.age = age;
        } else {
            System.out.println("年龄在1 - 120 ");
            this.age = 18;  //默认值
        }
    }
    public String info(){
       return("姓名为："+ name + "\t年龄为"+age
                + "\t薪水为"+salary);
    }
}
