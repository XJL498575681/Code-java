package com.xjl.Writer_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "e:\\tt.txt";
        FileWriter fileWriter = null;
/*
5中方式写入
3) _ write(int):写入单个字符
4) write(char[]):写入指定数组
5) write(char[] , off,len):写入指定数组的指定部分
6) write (string):写入整个字符串
7) write(string , off,len): 写入字符串的指定部分

 */
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            //write(int):写入单个字符
             fileWriter.write('H');

// write(char[]):写入指定数组
            fileWriter.write(chars);

//write(char[] , off,len):写入指定数组的指定部分
            fileWriter.write("嘎嘎嘎啦啦啦".toCharArray(),0,3);

            //6) write (string):写入整个字符串
            fileWriter.write("你好啊");

           // write(string , off,len): 写入字符串的指定部分
            fileWriter.write("上哈天津",0,2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null){
                try {
                    //一定要close 或者 flash
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
