package Homework.h6;

public class SavingAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.2;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

//    public SavingAccount(double initialBalance, int count, double rate) {
//        super(initialBalance);
//        this.count = count;
//        this.rate = rate;
//    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    @Override
    public void deposit(double amount) {
        if(count > 0 ){
            super.deposit(amount);
        }else{
            super.deposit((amount - 1 ));
        }
        count --;
    }


    @Override
    public void withdraw(double amount) {
        if(count > 0 ){
            super.withdraw(amount);
        }else{
            super.withdraw((amount + 1 ));
        }
        count --;
    }


    public void earnMouth(){
        count = 3;
        super.deposit(getBalance() * rate);
    }
}
