package com.encapsulation;

public class AccountTest {
    public static void main(String[] args) {


        Account account = new Account();
        Account account1 = new Account("0",32,"354554");

        account.setName("张三ncdn");
        account.setBalance(4);
        account.setPassword("12bfdbf3456");

        account.info();
        account1.info();



    }
}
