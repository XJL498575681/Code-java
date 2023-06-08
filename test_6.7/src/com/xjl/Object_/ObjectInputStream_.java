package com.xjl.Object_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{
        //指定反序列化文件
        String filePath = "e:\\data.dat";
        java.io.ObjectInputStream ois= new java.io.ObjectInputStream(new FileInputStream(filePath));


        //读取顺序一定要和保存序列化顺序一样
/*
        oos.writeInt(100);  // int ->Integer(实现了Serializable)
        oos.writeBoolean(true); //boolean -> Boolean
        oos.writeByte('c');//
        oos.writeChar('j');//
        oos.writeDouble(9.3);
        oos.writeFloat(9);
        oos.writeUTF("字符串 是UTF"); // String
 */

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readByte());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readFloat());
        System.out.println(ois.readUTF());

        //如果想要使用Dog 类的方法 需要向下转型
        //注意 如果对象类不在 同一个包下面 需要将方法权限扩大 需放在可以引用的位置
        Object dog = ois.readObject();
        System.out.println("运行类型" + dog.getClass());
        System.out.println(dog);


        ois.close();

    }
}
