package Homework.h6;

public class BankAccount {
    private double  balance;
    public BankAccount(double  initialBalance){
        this.balance = initialBalance;

    }

    //存
    public void deposit(double amount){
        balance += amount;
    }
    //取
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
