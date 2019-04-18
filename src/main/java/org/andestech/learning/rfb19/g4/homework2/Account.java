package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {
    private Customer customer;
    private float balance;
    private int accountId;

    public Customer getCustomer() {return customer;}

    public float getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public abstract float withdrawal(float money);

    public abstract float putMoney(float money);
}
