package Homework.h1;

public class w1 {
    public static void main(String[] args) {

        Person[] arr = new Person[3];

        arr[0] = new Person("jack",19,"老师");
        arr[1] = new Person("jak",16,"打工人");
        arr[2] = new Person("jk",17,"java");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -i - 1; j++) {
                if(arr[j].getAge() > arr[j+ 1].getAge()){
                    Person tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}

class Person{
    private String name;
    private int age;
    private  String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

