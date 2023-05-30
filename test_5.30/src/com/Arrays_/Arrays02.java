package com.Arrays_;

import java.util.Arrays;

//二叉查找
public class Arrays02 {
    public static void main(String[] args) {
        Integer[] arr = {1,24,54,57,86};
        int index = Arrays.binarySearch(arr,89);
        System.out.println(index);



        //数组拷贝   长度大于原数组 最后的为null
        Integer[] newArr = Arrays.copyOf(arr,arr.length  + 1);
        System.out.println(Arrays.toString(newArr));


        //数组填充（所有元素替换）
        Integer [] num = new Integer[]{3,0,4};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        Integer[] num1 = new Integer[]{3,0,4};

        Integer[] s1={1,9};
        Integer[]s2 = {1,9};

        boolean flag = Arrays.equals(s1,s2);
        System.out.println(flag);

        boolean flag1 = Arrays.equals(num,num1);
        System.out.println(flag);

    }
}
