package Homework.h6;

import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

public class Test {
    public static void main(String[] args) {
//        CheckBankAccount checkBankAccount = new CheckBankAccount(1000);
//        checkBankAccount.deposit(10);
//        System.out.println(checkBankAccount.getBalance());
//
//        checkBankAccount.withdraw(9);
//        System.out.println(checkBankAccount.getBalance());


        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());


        savingAccount.earnMouth();
        System.out.println(savingAccount.getBalance());
    }
}
