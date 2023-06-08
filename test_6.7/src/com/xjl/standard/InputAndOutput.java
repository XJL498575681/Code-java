package com.xjl.standard;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
      //public final static InputStream in = null;
        /*
        标准输入   键盘
        System.in 编译类型   InputStream
                  运行类型   BufferedInputStream
         */
        System.out.println(System.in.getClass());

        /*
        标准输出 显示器
        System.out  编译类型   PrintStream
                    运行类型   PrintStream

         */
        System.out.println(System.out.getClass());

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
    }
}
