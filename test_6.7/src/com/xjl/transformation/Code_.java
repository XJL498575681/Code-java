package com.xjl.transformation;

import java.io.*;

//中文乱码
public class Code_ {
    public static void main(String[] args) throws Exception{

        String filePath = "e:\\tts.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String s= bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();



    }
}
