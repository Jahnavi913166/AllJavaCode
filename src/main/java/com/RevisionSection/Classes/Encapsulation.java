package com.RevisionSection.Classes;

import java.util.Scanner;

//1. A Class Can Have Full Control Over Its Data Members
class InsufficientBalance extends Exception {
    InsufficientBalance(String msg) {
        super(msg);
    }

}

class BankAccount {
    private double balance;//field

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        System.out.println("deposit amount" + balance);
    }

    public void withdraw(double amount) throws InsufficientBalance {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new InsufficientBalance("You are trying to withdraw InsufficientBalance");
        }
        System.out.println("With draw successfully" + amount);
    }


}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        try {
            b1.withdraw(amount);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
    }
}
