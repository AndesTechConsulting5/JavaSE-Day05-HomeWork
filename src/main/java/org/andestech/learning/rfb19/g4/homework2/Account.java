package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {
    private int accountId;
    private double balance;
    private Customer customer;

    public abstract boolean withdrawal(double amount);
    public abstract boolean putMoney(double amount);

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + " balance: " + balance + " " + customer;
    }
}
