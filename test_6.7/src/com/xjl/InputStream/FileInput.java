package com.xjl.InputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {

    }
/*
单个字符读取 文件效率低
 */

    @Test
    public void readFile01()  {
        String filePath = "e:\\hello.txt";
        int read = 0;
        FileInputStream fileInputStream = null;
        try {
          fileInputStream = new FileInputStream(filePath);
            //返回-1 读取完毕
            while((read = fileInputStream.read()) != -1){
                System.out.println((char)read );//转成char
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {//关闭文件流
            //抛出异常
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }





    /*
    使用read(byte[] b)
     */
    @Test
    public void readFile02()  {
        String filePath = "e:\\hello.txt";
        //字节数组
        byte[] buf = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //返回-1 读取完毕
            while((readLen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf, 0,readLen));//转成字符显示
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {//关闭文件流
            //抛出异常
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



}
