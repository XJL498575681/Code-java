package com.xjl.set.treeset_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        // 无参构造器时 创建的TreeSet 仍然是无序的
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用toString 方法 进行字符串大小的比较
//                return ((String)o1).compareTo((String)o2) ;
                return ((String)o1).length() - ((String)o2).length();
                //此时比较的是两个字符串的长度大小  长度一样无法添加
            }
        });
        //添加数据.
        treeSet.add( "jack");
        treeSet.add("tom");
        treeSet.add( "sp");
        treeSet.add( "a");
        treeSet.add( "ug");

        System.out.println(treeSet);

    }
}


/*
    public int compareTo(String anotherString) {
        int len1 = value.length;
        int len2 = anotherString.value.length;
        int lim = Math.min(len1, len2);
        char v1[] = value;
        char v2[] = anotherString.value;

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }
 */