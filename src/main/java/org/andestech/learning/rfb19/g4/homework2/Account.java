package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {

    private Customer customer;
    private double balance;
    protected int accountId;

    public Account(Customer customer, double balance, int accountId) {
        this.customer = customer;
        this.balance = balance;
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void putMoney(double delta){
        this.balance += delta;
    }

    public void withdrawal(double delta){
        this.balance -= delta;
    }

    //check
    protected boolean checkDelta(String typeAccount, double delta, double MIN_DELTA, double MAX_DELTA){
        if(delta >= MIN_DELTA && delta <= MAX_DELTA){
            return true;
        } else {
            System.out.println("Attention! Wrong sum for " + typeAccount + " account.\n" +
                               "Put and withdrawal for " + typeAccount + " sum should be between " + MIN_DELTA + " and " + MAX_DELTA + "\n" +
                               " actual sum = " + String.format("%.2f", delta));
            return false;
        }
    }

    protected boolean checkLimit(String TYPE_ACCOUNT, double delta, double MIN_BALANCE, double MAX_BALANCE){
        if((balance - delta) >= MIN_BALANCE && (balance + delta) <= MAX_BALANCE){
            return true;
        } else {
            System.out.println("Attention! Limit is over for " + TYPE_ACCOUNT + " account.\n" +
                               "Limit of " + TYPE_ACCOUNT + " account should be between " + MIN_BALANCE + " and " + String.format("%.2f", MAX_BALANCE) + "\n" +
                               " actual balance = " + balance + " you delta = " + String.format("%.2f", delta));
            return false;
        }
    }

}
