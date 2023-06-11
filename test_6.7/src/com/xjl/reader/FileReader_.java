package com.xjl.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

         String filePath = "e:\\kk.txt";
         FileReader fileReader = null;
         //单个字符
//         int data = 0;

         //字符数组
        char[] data = new char[1024];
        int charLen = 0;
         //创建对象
        try {
            fileReader = new FileReader(filePath);
            //单个字符
//            while((data = fileReader.read()) != -1){
//                System.out.print((char)data);
//            }
            //字符数组
            while((charLen = fileReader.read(data))!= -1){
                System.out.println(new String(data,0,charLen));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
