package com.xjl.Object_.equals_.introduce;
//比较运算符

public class equalss {
    public static void main(String[] args) {
        A a =new A();
        A b = a;
        A c = b;
        System.out.println(a == c);  // true
        System.out.println(b == c);  // true

        B bobj = a;
        System.out.println(bobj == c); //true

        System.out.println("hello".equals("abc") ); //false

        Integer integer1 = new Integer(1000);//false
        Integer integer2 = new Integer(1000);//true
        System.out.println(integer1 == integer2 );
        System.out.println(integer1.equals(integer2));


        String str1 = new String("abcdef");
        String str2 = new String("abcdef");
        System.out.println(str1 == str2);  //false
        System.out.println(str1.equals(str2)); //true





    }

}

class B{

}


class A extends B{

}


/*
        String  的equals 方法重写了，变成了比较两个字符串值是否相同
 public boolean equals(Object anObject) {
        if (this == anObject) {  //表示同一个对象
            return true; // 返回true
        }
        if (anObject instanceof String) {  //判断类型
            String anotherString = (String)anObject; //向下转型
            int n = value.length;
            if (n == anotherString.value.length) {  //如果长度相同
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {  //一个一个的比较字符
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//都相等 返回true
            }
        }
        return false; //如果比较的不是字符串 直接返回false
    }


      Object  类的equals  默认比较对象地址是否相同
      判断两个对象是不是统一对象

         public boolean equals(Object obj) {
        return (this == obj);
    }


    Integer 重写了Object 的equals 方法
    判断值是否相等
   public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }


 */