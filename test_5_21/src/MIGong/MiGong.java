package MIGong;

public class MiGong {
    public static void main(String[] args) {

        int [][] arr = new int[8][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i== 0 || j == 0 || j == arr[i].length -1
                        || i == arr.length -1 ){
                    arr[i][j] = 1;
                }
            }
        }
        arr[3][2] = arr[3][1] =  1;

        arr[2][2] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        T t = new T();
        t.findWay(arr,1,1);
        System.out.println("走路的情况");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*
0表示可以走 1 表示障碍物 2表示可以走 3表示走过 到那时走不通，死路

策略 下- 右 - 上 - 左
 */


class T{
     public boolean findWay(int [][] arr,int i ,int j){
         if(arr[6][5] == 2){
             return true;
         }else{
             if(arr[i][j] == 0){

                 arr[i][j] =2;
                 if(findWay(arr,i+ 1,j)){
                     return true;
                 }else if(findWay(arr,i,j+1)){
                     return true;
                 }else if(findWay(arr,i- 1,j)){
                     return true;
                 }else if(findWay(arr,i,j-1)){
                     return true;
                 }else{
                     arr[i][j] = 3;
                     return false;
                 }
             }else{
                 return false;
             }
         }

     }
}
