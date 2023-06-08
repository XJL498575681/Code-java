package com.xjl.ChuLiClass.RW;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader_ {
    public static void main(String[] args) throws Exception{

        String filePath = "e:\\kk.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line;  //按行读取  返回null 表示读取完毕

        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        //关闭流

        bufferedReader.close();


    }
}
