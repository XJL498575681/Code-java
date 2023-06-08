package com.xjl.homework;


import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class h3 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileReader("src\\Dog.properties"));
        properties.list(System.out);

        String name = properties.getProperty("name");
        int age =Integer.parseInt(properties.getProperty("age")+"");
        String color = properties.getProperty("color");


        Dog dog = new Dog(name, age, color);
        System.out.println(dog);


        //序列化
        String filePath = "e:\\ccc.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

        objectOutputStream.writeObject(dog);

        objectOutputStream.close();

    }
    @Test
    public void m1(){
        String filePath = "e:\\ccc.txt";
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            try {
                Dog dog = (Dog)objectInputStream.readObject();
                System.out.println(dog);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
