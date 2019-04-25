package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {

    private final long  accountId;
    private final Customer customer;
    protected double balance;

    public Account(long accountId, Customer customer, double balance) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
    }

    protected abstract void withdrawal(double delta);
    protected abstract void putMoney(double amount);
    protected abstract boolean isValidBalance(double balance);

    public long getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if(!isValidBalance(balance)){
            throw new IllegalArgumentException("Incorrect balance: " + balance);
        }
        this.balance = balance;
    }
}
