package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {

    private static final double MIN_BALANCE = 10;
    private static final double MAX_BALANCE = 1_000_000_000;

    private static final double MIN_DELTA = 1;
    private static final double MAX_DELTA = 1_000_000;

    private final long  accountId;
    private final Customer customer;
    protected double balance;

    public Account(long accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = MIN_BALANCE;
    }

    public abstract void withdrawal(double delta);
    public abstract void putMoney(double amount);

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

    protected void checkDelta(double delta){
        if(!(MIN_DELTA <= delta && delta <= MAX_DELTA)){
            throw new IllegalArgumentException("Incorrect delta: " + delta);
        }
    }

    private boolean isValidBalance(double balance){
        return MIN_BALANCE <= balance && balance <= MAX_BALANCE;
    }
}
