package constructor;

public class constructor {
    public static void main(String[] args) {

        Person p1 = new Person("张三",10);

        Person p2 = new Person("王五");
        System.out.println(p1.name +" " + p1.age);


        Person p3 = new Person();
        System.out.println(p3.name);




        Dog d1 = new Dog();
    }
}

class Person{
    String name;
    int age;
    public Person(){
        age = 18;
    }
    //进行初始化对象信息
    public Person(String pName ,int pAge){
        name = pName;
        age = pAge;
    }

    public Person(String pName){
        name = pName;
    }
    public Person(int pAge){
        age= pAge;
    }
}


class Dog{
    String name;
    int age;
    //显式定义一下默认空参构造器
    public Dog(){

    }
    public Dog(String dName, int dAge){
        name = dName;
        age = dAge;
    }
}