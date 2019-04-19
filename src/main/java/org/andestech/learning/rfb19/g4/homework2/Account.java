package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {

    public Customer customer;
    public double   balance;
    public int      accountId;


    public abstract void  withdrawal(double delta);
    public abstract void  putMoney(double delta);

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;

    }
}
