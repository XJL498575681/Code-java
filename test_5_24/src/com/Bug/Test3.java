package com.Bug;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int arr[]  ={1,45,6,-5,3};
        //底层实现
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
