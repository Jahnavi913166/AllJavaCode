package com.RevisionSection.Exception;

import java.util.Scanner;

class InSufficientBalanceException extends Exception {
    InSufficientBalanceException(String msg) {
        super(msg);
    }

}

class Account {
    private int AccountNo;
    private static double balance;

    static {
        balance = 0;
    }


    Account(int AccountNo, double balance) {
        this.AccountNo = AccountNo;
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void withDrawMoney(double amount) throws InSufficientBalanceException {
        if (balance < amount) {
            throw new InSufficientBalanceException("less balance");
        }
        balance -= amount;
    }


    public void currentBalance() {
        System.out.println("currentBalance: " + balance);
    }


}


public class UserDefinedCheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(101, 5000);//default
        account.addMoney(1000);
        account.currentBalance();
        System.out.println("Enter amount: ");
        double amount = sc.nextDouble();
        try {
            account.withDrawMoney(amount);
        } catch (InSufficientBalanceException e) {
            System.out.println("you don't have enough money");
            System.out.println(e.getMessage());
        }

        account.currentBalance();

    }
}
