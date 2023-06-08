package com.xjl.Object_;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception{

        //序列化后 保存的数据格式是按照他的格式
        String filePath = "e:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化
        oos.writeInt(100);  // int ->Integer(实现了Serializable)
        oos.writeBoolean(true); //boolean -> Boolean
        oos.writeByte('c');//
        oos.writeChar('j');//
        oos.writeDouble(9.3);
        oos.writeFloat(9);
        oos.writeUTF("字符串 是UTF"); // String


        //保存对象
        oos.writeObject(new Dog("旺财",10));

        oos.close();
        System.out.println("序列化形式");

    }
}


//序列化对象必须 实现 Serializable

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}