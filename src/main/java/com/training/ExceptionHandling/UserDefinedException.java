package com.training.ExceptionHandling;

import java.util.Scanner;

class SavingAccount {
    private int accountNo;
    private static double balance;

    public SavingAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance = balance + amount;
    }

    public void withDrawMoney(double amount) throws InsufficientBalance{//caller method
        if(balance<amount){
            throw new InsufficientBalance("InsufficientBalanace");
        }
        balance = balance - amount;

    }

    public void currentBalance() {
        System.out.println("Current balance is:" + balance);

    }


}
class InsufficientBalance extends Exception{//check exception
    public InsufficientBalance(String msg){
        super(msg);
    }

}

class Main{
    public static void testDriver() throws InsufficientBalance{
        Scanner sc = new Scanner(System.in);
        SavingAccount account = new SavingAccount(100, 5000);
        account.currentBalance();

        System.out.println("Enter amount to withdraw:");
        double d = sc.nextDouble();
//        try {
            account.withDrawMoney(d);//caller method
       /* }
        catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }*/
        account.currentBalance();

    }

}

public class UserDefinedException {

    public static void main(String[] s) throws InsufficientBalance{
        //try {
            Main.testDriver();//caller method
       /* }
        catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }*/

    }

}
