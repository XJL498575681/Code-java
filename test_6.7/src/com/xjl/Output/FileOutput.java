package com.xjl.Output;


import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutput {
    public static void main(String[] args) {

    }
@Test
//将书库写入到文件中 没有该文件就 创建一个文件
    public void writeFile(){
        //创建 FileOutputStream 对象
        String filePath1  = "e:\\kk.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到 FileOutputStream对象
            // new FileOutputStream(filePath)会覆盖原来的数据
            // 追加  new FileOutputStream(filePath，true)
            fileOutputStream = new FileOutputStream(filePath1,true);

            //写入一个字节
            fileOutputStream.write('H');  // 会将字符H转换成int
            //写入一个字符串   str.getBytes() 把字符串  转换成  字符数组
            String str= "hello,hi";
//            fileOutputStream.write(str.getBytes());

            fileOutputStream.write(str.getBytes(),0,str.length());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
