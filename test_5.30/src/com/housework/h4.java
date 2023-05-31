package com.housework;
import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        check(s);
        cal(s);
    }

    public static void check(String s){
        if(s == null){
            System.out.println("字符串为空");
            return ;
        }
    }

  public static void cal(String s) {
      char[] c = s.toString().toCharArray();
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;

      for (int i = 0; i < c.length; i++) {
          if (c[i] >= 'A' && c[i] <= 'Z') {
              count1++;
          } else if (c[i] >= 'a' && c[i] <= 'z') {
              count2++;
          } else if (c[i] >= '0' && c[i] <= '9') {
              count3++;
          }else{

          }
      }

      System.out.println("大写字母" + count1);
      System.out.println("小写字母" + count2);
      System.out.println("数字" + count3);
  }





}
