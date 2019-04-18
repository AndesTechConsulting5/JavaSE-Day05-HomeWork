package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    public DebitAccount(long accountId, Customer customer, double balance) {
        super(accountId, customer);
    }

    @Override
    public void withdrawal(double delta) {
       checkDelta(delta);
       setBalance(this.balance - delta);
    }

    @Override
    public void putMoney(double delta) {
        checkDelta(delta);
        setBalance(this.balance + delta);
    }
}
