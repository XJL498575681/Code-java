package com.encapsulation;

public class Account {

    private String name;
    private double balance;
    private String password;


    //构造器


    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    //get  set

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name.length()  == 2 ||name.length() == 3||name.length()== 4){
           this.name = name;
       }else{
           System.out.println("姓名长度有误");
           this.name = "null";
       }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20){
            this.balance = balance;
        }else{
            System.out.println("余额不足20");
            this.balance = 0.0;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else{
            System.out.println("密码必须六位");
            this.password = null;
        }
    }

    public void info(){
        System.out.println("姓名"+name + "\t余额"+ balance+ "\t密码" + password );
    }
}
