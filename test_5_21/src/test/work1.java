package test;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        double[] map = {2.4,5.6,9.0,8.9};
        T t = new T();
        if(t.findMax(map) != null){
            System.out.println( t.findMax(map));
        }else{
            System.out.println("数组有误");
        }

        System.out.println();

        String str = "abcd";
        String[] strr = {"abde","akcd","degfg"};
        A a =new A();
        if(a.findIndex(str,strr) != -1){
            System.out.println("找到了 ， 下标是"+a.findIndex(str,strr) );
        }else{
            System.out.println("没有该字符串");
        }



        System.out.println();


        Book bk = new Book("三国演义",180);
        bk.info();


        System.out.println();


        int[] oldArr = {1,2,3,4,54};
        copyArr c1 = new copyArr();
        c1.copy(oldArr);
        c1.print(c1.copy(oldArr));


        System.out.println();

        Circle ci = new Circle(5.0);
        System.out.println(ci.findArea());
        System.out.println(ci.findCir());


        System.out.println();

        Cale ca = new Cale(2,5);
        System.out.println("和  "+ ca.Add());
        System.out.println("差  "+ ca.Sub());
        System.out.println("商  "+ ca.Div());
        System.out.println("积  "+ ca.Mul());

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();
        Circle cl = new Circle();

        PassObject po = new PassObject();
        po.printAreas(cl,num);




    }

}

class T{

    public Double findMax(double[]num){
        if(num.length > 0 && num !=null ){
            double max = num[0];
            for (int i = 0; i < num.length; i++) {
                if(num[i] > max){
                    max = num[i];
                }
            }
            return max;
        }else{
            return null;
        }

    }
}


class A{

    public int findIndex(String findStr,String[] str){
        for (int i = 0; i < str.length; i++) {
            if(findStr.equals(str[i])){
                return i;
            }
        }
        return -1;
    }
}



class Book{
    String name;
    double price;

    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        if(this.price > 150){
            this.price = 150;
        }else if(this.price > 100){
            this.price = 100;
        }
    }
    public void info(){
        System.out.println("书名\t"+ name + " 价格\t" + price);
    }
}


class copyArr{
    public int[] copy(int[] oldArr){
        int[] newArr = new int[oldArr.length];
        for (int i = 1; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}


class Circle{
    double radius;
    public Circle(){

    }

    public Circle(double radius){

        this.radius = radius;
    }

    public double findCir(){
        return 2*radius*Math.PI;
    }
    public double findArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    public void printAreas(Circle c,int times){
        System.out.println("radius\tarea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println((double)i +"\t"+ c.findArea());
        }

    }
}

class Cale{
    double a;
    double b;

    public Cale(double a,double b){
        this.a = a;
        this.b = b;
    }
    public double Add(){
        return  a + b;
    }
    public double Sub(){
        return  a - b;
    }
    public double Mul(){
        return  a * b;
    }
    public Double Div(){
       if(b == 0){
           System.out.println("除数等于0");
           return null;
       }else{
           return a / b;
       }
    }
}


class   Employee{
    String name;
    char sex;
    int age;
    String work;
    double salary;

    public Employee(String work,double salary){
        this.work = work;
        this.salary = salary;
    }
    public Employee(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String name,char sex,int age,
                    String work,double salary){
        this(name,sex,age);
        this.work = work;
        this.salary = salary;
    }
}


