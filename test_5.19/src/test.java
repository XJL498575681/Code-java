import java.util.Scanner;

import static java.lang.Math.pow;

/*
常用快捷键
1.删除当前行 已配置Ctrl + D
2.复制当前行 Ctrl+ alt + 向下光标
3.补全代码 alt + /
4.导入该行需要的类  alt + enter
5.快速格式化代码 Ctrl + alt+ L
6.快速运行程序  alt + r
7.生成构造器  alt +  insert
8.查看类的层次关系   Ctrl +  h
9.定位方法 ctrl + b   可以快速定位方法
10.自动分配变量名  在后面加.var
 */
public class test{
    public static void main(String[] args) {
/*        //byte类型 存放范围在-128 - 127
        byte i = 127;
        System.out.println(i);*/

/*
        int  a = 10;
        int b= 20;

        char a1 = 97;
        System.out.println(a1);  //a

        char c1 = 'a';
        System.out.println(c1);//a
        System.out.println((int)c1); // 97

        System.out.println(c1 + 1);


        //char 类型是可以进行运算的，相当于一个整数,没进行强制转换，输出都是字符

        char c3 = 'b' + 1;
        System.out.println(c3);  //c
        System.out.println((int)c3);  //99



*/
        //boolean类型   ---- 用于条件判断    不能用 0 或者非0 表示

/*        boolean isPass = true;
        if(isPass == true){
            System.out.println("通过");
        }else{
            System.out.println("失败");
        }*/




        //精度转换
//        int a = 'a';
//        System.out.println(a);

//        int i1 = 1.1;    高精度 -> 低精度   xxx   只能进行强制转换

        // (byte ,short) 和char  之间不会互相自动转换 ， 但是可以相互计算 首先转换成int 类型
    /*    byte b1 = 10;
        char c1 = b1;
        char c1 = 1;
        short s2 = 1;
        int i = c1 + s2;
        System.out.println(i);

     */


//        int i1= (int)1.9;
//        System.out.println(i1);  //精度损失
//
//        int i2= 129;
//        byte b1 = (byte)i2;
//        System.out.println(b1);   //数据溢出




/*        //String 类型 ->  基本数据类型的转换  确保有效的数据转换

        int n1 = 10;
        float f1 = 1.2f;
        double d1 =4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1+ "";
        String s4 = b1 + "";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        //基本数据类型对应的包装类相应的方法  得到基本数据类型
        String s5 = "123";
         int num = Integer.parseInt(s5);
        System.out.println(num);

        //boolean 转换 除了不是true 转进去 ，其余的一切都是false
        boolean b5 = Boolean.parseBoolean("true");
        System.out.println(b5);


        //字符串-》char   等价于取出字符串第n个下标对应的字符
        System.out.println(s5.charAt(1)); //   字符   '2'*/


        //数字格式化异常   NumberFormatException
//        String sl = "hello";
//        int nume = Integer.parseInt(sl);


        //运算符  a%b 公式 == a - a / b * b  符号由第一位决定
/*
        int i= 1;
        i = i++;
        System.out.println(i);*/

        //键盘输入


   /*     Scanner myScanner = new Scanner(System.in);

        String name = myScanner.next();
        int age = myScanner.nextInt();
        double score = myScanner.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
*/


//        Scanner scanner = new Scanner(System.in);
//        int line = scanner.nextInt();
//
//        //上半部分
//        for (int i = 0; i <= line; i++) {
//            //打印空格
//            for (int j = 0; j < line - i; j++) {
//                System.out.print(" ");
//            }
//            //打印*
//            for (int j = 0; j < 2 * i-1; j++) {
//                if(j == 0 || j == 2* i -2){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }
//        //下
//        for (int i = 0; i < line; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <  2*(line - i) - 1; j++) {
//                if(j == 0 || j == 2*(line - i) -2){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }


/*        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        int tep =  num;
        int sum = 0;
        while(tep != 0){
            tep/=10;
            count ++;
        }

        tep = num;
        while(tep != 0){
            sum+=pow(tep%10,count);
            tep /= 10;
        }
        if(sum == num){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }*/
        double sum = 0;
        int flag = 1;

        for (int i = 1; i <= 100; i++) {
            sum+=(1.0/i*(flag));
            flag = -flag;
        }
        System.out.println(sum);







    }
}



