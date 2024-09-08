package com.RevisionSection.Classes;

interface Bank {
    //abstract method
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);

    //displayAccountType
    default void displayAccountType() {
        System.out.println("Account Type: Generic");
    }

    // Static method to create a bank account
    static Bank createAccount(double initialBalance) {
        return new SavingAccount(initialBalance);
    }

}


class SavingAccount implements Bank {
    private double balance;

    SavingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }

    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}


public class DefaultMethods_InInterface {
    public static void main(String[] args) {
        Bank b = Bank.createAccount(20000);
        b.deposit(5000);
        System.out.println(b.getBalance());
        b.withdraw(10000);
        System.out.println(b.getBalance());
        b.displayAccountType();
        System.out.println(b instanceof SavingAccount);
    }
}
