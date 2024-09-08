package com.RevisionSection.Classes;

interface Java9DBlogging {
    default void logInfo(String message) {
        log(message, "INFO");
    }

    default void logWarn(String message) {
        log(message, "WARN");
    }

    default void logError(String message) {
        log(message, "ERROR");
    }

    private static void log(String message, String logLevel) {
        //-private methods in the interface can be either static or non-static
        System.out.println(message + " " + logLevel);
    }

}

class DB implements Java9DBlogging {

}

interface Bank1 {
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);

    default void executionTransaction(String transactionType, double amount) {
        if (transactionType.equalsIgnoreCase("DEPOSIT")) {
            deposit(amount);
            logTransaction(transactionType, amount);
        } else if (transactionType.equalsIgnoreCase("WITHDRAW") && sufficientFunds(amount)) {
            withdraw(amount);
            logTransaction(transactionType, amount);
        } else {
            System.out.println("Transaction Failed,Insufficient funds");
        }
    }

    private void logTransaction(String transactionType, double amount) {//code reusability
        System.out.println("Transaction Type:" + transactionType);
        System.out.println("Amount :" + amount);
        System.out.println("Current Balance $:" + getBalance());
        System.out.println();
    }

    private boolean sufficientFunds(double amount) {
        return getBalance() >= amount;
    }


}

class SavingAccount1 implements Bank1 {
    private double balance;

    public SavingAccount1(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }


}


public class Interface_privateMethods {
    public static void main(String[] args) {
        Bank1 b = new SavingAccount1(10000);
        b.executionTransaction("deposit", 5000);
        b.executionTransaction("withdraw",1000);
        b.executionTransaction("withdraw",15000);

    }
}
