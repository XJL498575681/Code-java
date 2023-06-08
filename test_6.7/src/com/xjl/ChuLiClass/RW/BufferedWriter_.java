package com.xjl.ChuLiClass.RW;

import java.io.*;

public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{

        String filePath = "e:\\tt.txt";

        //文本追加用的是FileWriter 的方式
        // new FileWriter(filePath ,ture)

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));

        bufferedWriter.write("hello hihihi");
        bufferedWriter.newLine();//换行符
        bufferedWriter.write("hello hihihi");
        bufferedWriter.newLine();
        bufferedWriter.write("hello hihihi");


        bufferedWriter.close();
    }
}
