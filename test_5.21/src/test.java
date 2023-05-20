import javax.tools.Tool;

//类与对象
public class test {

    public static void main(String[] args){
        Cat c1 = new Cat();
        /*
         c1 是对象名  对象引用
         new Cat()  才是真正的对象
         创建对象的基本流程
         1.先加载类信息 （属性和方法信息，只加载一次）
         2.在堆中分配空间，进行默认初始化
         3,将地址赋值给对象
         4.进行指定初始化
         */
        c1.name = "小贝";
        c1.age = 19;
        c1.color = "黄色";
        System.out.println("名字 "+ c1.name + " 年龄 " +
                c1.age + "  颜色 "+ c1.color );

        Person p1 = new Person();
        p1.speak();
        p1.cal(100);


        int[][] arr = {{1,2,3,3},{3,5,6,7}};
        tools tool = new tools();
        tool.print(arr);


        AA a = new AA();
        int[] res = a.getSumAndSub(1,2);
        System.out.println(res[0]);
        System.out.println(res[1]);


        isOddEven ret = new isOddEven();
        boolean  temp = ret.math(9);
        if(temp){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }

        printf pf1 = new printf();
        pf1.print(3,4,'#');

    }
}


class Cat{
    String  name;
    int  age;
    String color;
}



class Person{
     String name;
     int age;

     public void speak(){
         System.out.println("good");
     }

     public void cal(int n){
         int sum = 0;
         for (int i = 0; i < n; i++) {
             sum+=i;
         }
         System.out.println(sum);
     }
}


class tools{
    public void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



class AA{
    public int[] getSumAndSub(int n1,int n2){
        int [] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
}


class  isOddEven{
    public boolean math(int num){
//        if(num % 2 == 0){
//            return true;
//        }else{
//            return false;
//        }
        return (num % 2 == 0 );
    }
}


class printf{
    public void print(int row,int col,char w ){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}