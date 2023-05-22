package com.pkg;

import java.util.Arrays;

public class import1 {
    public static void main(String[] args) {
        int [] arr = {-1,2,3,4,7,5,9,8};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
