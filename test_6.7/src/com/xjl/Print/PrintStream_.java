package com.xjl.Print;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
// PrintStream 默认数据输出位置 显示器
        /*
            public void print(String s) {
        if (s == null) {
            s = "null";
        }
        write(s);   本质就是write
    }
         */

        out.print("hihihihi ");

        //底层就是使用write 可以直接调用write 进行打印输出
        out.write("你好你好".getBytes());

        out.close();



        //修改打印流输出的位置
        System.setOut(new PrintStream("e:\\ff.txt"));
        System.out.println("hello ");
    }
}
