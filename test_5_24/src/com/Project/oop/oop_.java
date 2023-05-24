package com.Project.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;









public class oop_ {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String input = "";

        String detail  = "*********零钱通菜单********";

        double money;
        double balance = 0;

        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note = "";


        public void mainMenu(){
            do{

                System.out.println("\np*********零钱通菜单********");
                System.out.println("*********1.零钱明细********");
                System.out.println("*********2.收益入账********");
                System.out.println("*********3.消费情况********");
                System.out.println("*********4. 退出  ********");

                System.out.println("请选择1 -4 ");
                input = scanner.next();

                switch(input){
                    case "1":
                      this.details();
                      break;
                    case"2":
                        this.income();
                        break;
                    case "3":
                        this.pay();
                        break;
                    case "4":
                        this.exit();
                        break;
                    default:
                        System.out.println("选择有误");
                }
            }while(loop);
            System.out.println("退出了零钱通项目");
    }

    public void details(){
        System.out.println(detail);
    }

    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        if(money <= 0 ){
            System.out.println("收益金额 >= 0");
            return ;
        }

        balance +=money;

        date = new Date();
        detail +="\n收益入账\t +"+ money + "\t" + sdf.format(date)
                +"\t" + balance;
    }


    public void pay(){
        System.out.println("消费金额");
        money= scanner.nextDouble();
        System.out.println("消费说明");
        if(money <= 0 ||money > balance ){
            System.out.println("消费金额 >= 0 且 不得超过余额");
           return ;
        }

        note = scanner.next();

        balance -= money;
        date = new Date();
        detail +="\n"+note +"\t-" +money + "\t" + sdf.format(date)
                +"\t" + balance;
    }

    public void exit(){
        String choice = "";
        while(true){
            System.out.println("你确定要退出吗 y / n ");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        if(choice.equals("y"))
            loop= false;

    }

}
