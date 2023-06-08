package com.xjl.transformation;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ww.txt";
        //指定编码格式保存文件
        String charSet = "gbk";

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath), charSet);

        outputStreamWriter.write("你好呀");
        outputStreamWriter.close();



    }
}
