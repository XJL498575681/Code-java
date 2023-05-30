package com.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysCustom {
    public static void main(String[] args) {

        int [] arr = {1,-3,4,7,86,65};
//        BubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

        BubbleSort2(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return  i2  - i1;
            }
        });


        System.out.println(Arrays.toString(arr));
    }


    //冒泡函数
    public static  void BubbleSort(int []arr){
        int tmp = 0;
        for (int i = 0; i < arr.length -1; i++) {

            for (int j = 0; j < arr.length -1 -i; j++) {
                if(arr[j] > arr[j+ 1]){
                    tmp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    //冒泡 + 定制
    public static  void BubbleSort2(int []arr, Comparator c){
        int tmp = 0;
        for (int i = 0; i < arr.length -1; i++) {

            for (int j = 0; j < arr.length -1 -i; j++) {
                if(c.compare(arr[j],arr[j+ 1]) > 0 ){

                    tmp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
