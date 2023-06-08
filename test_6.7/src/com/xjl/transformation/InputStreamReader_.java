package com.xjl.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "e:\\tts.txt";

        //字节流 -> 字符流   并指定编码
//        InputStreamReader gbk = new InputStreamReader(new FileInputStream(filePath), "gbk");
//
        // 字符流 -> 处理流,包装流
//        BufferedReader bufferedReader = new BufferedReader(gbk);
//

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));



        String s = bufferedReader.readLine();
        System.out.println(s);

        //关闭包装流
        bufferedReader.close();
    }
}
