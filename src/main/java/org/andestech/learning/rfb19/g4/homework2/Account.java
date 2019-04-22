package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {

    //vars
    private double balance;
    private int accountId;
    private static double minBalance = 0;
    private static double maxBalance = 1_000_000;
    private static double minRange = 0;
    private static double maxRange = 100_000;
    private static int adult = 18;
    private Customer customer;

    //setters and getters for vars
    public static double getMinBalance() {
        return minBalance;
    }

    public static double getMaxBalance() {
        return maxBalance;
    }

    public static double getMinRange() {
        return minRange;
    }

    public static double getMaxRange() {
        return maxRange;
    }

    public static int getAdult() { return adult; }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //constructor check balance
    public void setBalance(double balance) {
        if (!DebitAccount.CheckBalance(balance)) {
            return;
        }
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    //constructor AccountId
    public Account(int accountId, Customer customer, double balance) {
    }

    //abstract method
    public abstract void withdraw(double cash);
    public abstract void putMoney(double cash);


}
