package com.xjl.Print;


import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) {


        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.print("你好");

        printWriter.close();
    }
}
