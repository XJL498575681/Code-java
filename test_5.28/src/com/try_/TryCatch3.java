package com.try_;

import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       int num =0;
       String input = "";
        while(true){
            System.out.println("请输入一个整数");
            input = scanner.next();
            try {
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个整数");
            }
        }
        System.out.println(num);
    }
}

