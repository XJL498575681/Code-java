import java.util.Scanner;


public class test {
    public static void main(String[] args) {

      //  Scanner scanner = new Scanner(System.in);

   /*     int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] +" "); ;
        }
*/


//        char char1[] = {'a','b','c','d'};
//
//        for (int i = 0; i < char1.length; i++) {
//            System.out.print( char1[i] +" "); ;
//        }
//        String s[] = {"absmnv"};
//        System.out.println(s[0]);




        //数组赋值机制  ---   引用传递

//        int arr[] = {1,2,3,};
//        int  arr1 []= arr;
//        arr1[2] = 10;
//        System.out.println(arr[2]); //改变了arr 原本的值


//        //数组拷贝
//        int [] arr1 = {10,20,30};
//        int [] arr2 = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]+ " ");
//        }

/*        //数组反转
        int []arr1 = {11,22,33,44,55,66};
        for (int i = 0; i < arr1.length/2 ; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 -i];
            arr1[arr1.length -1-i] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }*/

//        //数组增加数字
//        Scanner scanner1 = new Scanner(System.in);
//        int[] arr = {1, 2, 3};
//        do {
//
//            int[] newArr = new int[arr.length + 1];
//            for (int i = 0; i < arr.length; i++) {
//                newArr[i] = arr[i];
//            }
//            System.out.println("输入要添加的元素");
//            int addNum = scanner1.nextInt();
//
//            newArr[newArr.length - 1] = addNum;
//
//            arr = newArr;
//
//            for (int i = 0; i < newArr.length; i++) {
//                System.out.printf(newArr[i] + " ");
//            }
//            System.out.println("是否继续添加");
//            char input = scanner1.next().charAt(0);
//            if(input == 'n'){
//                break;
//            }
//        }while(true);

/*
        //冒泡
        int [] arr = {1,3,54,6,7,4};
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 1;
            for (int j = 0; j < arr.length - 1  - i ; j++) {
                if(arr[j] > arr[j+ 1]){
                    int temp = arr[j];
                    arr[j] = arr[ j + 1];
                    arr[ j+ 1] = temp;
                    flag = 0;
                }
            }
            if(flag == 1){
            break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
*/


/*        //顺序查找
        Scanner scanner = new Scanner(System.in);
        int ret = scanner.nextInt();
        int flag = 1;
        int [] arr = {1,23,4,5,56,6};
        for (int i = 0; i < arr.length; i++) {
            if(ret == arr[i]){
                System.out.println("找到了，下标是" + i);
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("没有该数");
        }
        */


/*        //二分查找
        int [] arr = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        int ret = scanner.nextInt();
        int mid = 0;
        int  left = 0;
        int flag = 1;
        int right = arr.length - 1;
        while(left <= right){
              mid = (left + right )/2;

            if(ret < arr[mid] ){
                right = mid -1;
            }else if(ret > arr[mid]){
                left = mid +1;
            }else{
                System.out.println("找到了" + mid);
                flag =0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("没有该元素");
        }*/


/*        String [] name = { "张三","李四","王五","赵六"};
        Scanner scanner = new Scanner(System.in);
        String ret = scanner.next();

        int flag = 1;
        for (int i = 0; i < name.length; i++) {
            if(ret.equals(name[i])){
                System.out.println(name[i] + " " + "下标为" + i);
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("找不到啊");
        }*/



        //二维数组

        /*
        若干个一维数组组成 arr.length  表示多少个以为数组长度
        arr[i].length  表示每个一维数组的长度
         */

/*        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/


    /*    //初始化
        int[][] arr = new int[3][];
        int[][] arr1 = {{1,2,3,4},{2,3,4,5,6}};

*/



/*        //杨辉三角


        Scanner scanner = new Scanner(System.in);
        int  line = scanner.nextInt();

        int [][] arr = new int[line][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i +1];

            for (int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == arr[i].length - 1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

//在有序数组中插入一个数
/*        Scanner scanner = new Scanner(System.in);


        int[] arr ={10,12,45,90};
        int [] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i+1] = arr[i];
        }
        int num = scanner.nextInt();
        for (int i = 0; i < arr1.length; i++) {

            if((arr1[i] <num) && (arr1[i +1] > num) ){

                for (int j = 0; j < i; j++) {
                    arr1[j] = arr1[j + 1];
                }
                arr1[i] =  num;
                break;
            }
        }
        arr = arr1;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }*/



        int[] arr = {10,12,45,90};
        Scanner scanner = new Scanner(System.in);
        int ret = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(ret <= arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            index = arr.length;
        }

        int[] arr1 = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (i != index) {
                arr1[i] = arr[j];
                j++;
            }else{
                arr1[i] = ret;
            }
        }
        arr = arr1;

        for (int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i] + " ");
     }






    }
}
