package com.housework;

public class h1 {
    public static void main(String[] args) {
        String s= "abcdef";

        System.out.println(s);
        try {
            s = reverse(null,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(s);
    }



    public static String reverse(String str,int start,int end){
        if(!(str != null &&start >= 0 && end < str.length() &&  end >start)) throw new RuntimeException("参数不正确");

    char[] chars = str.toCharArray();
    char temp = ' ';
            for (int i = start,j = end; i < j; i++,j--) {
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
            return new String(chars);
  }

}
