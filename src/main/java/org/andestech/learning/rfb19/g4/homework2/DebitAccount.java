package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    private static final double MIN_DEBIT_BALANCE = 10;
    private static final double MAX_DEBIT_BALANCE = 1_000_000_000;

    private static final double MIN_DEBIT_DELTA = 1;
    private static final double MAX_DEBIT_DELTA = 1_000_000;

    public DebitAccount(long accountId, Customer customer, double balance) {
        super(accountId, customer, MIN_DEBIT_BALANCE);
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

    @Override
    protected boolean isValidBalance(double balance) {
        return MIN_DEBIT_BALANCE <= balance && balance <= MAX_DEBIT_BALANCE;
    }
    private void checkDelta(double delta){
        if(!(MIN_DEBIT_DELTA <= delta && delta <= MAX_DEBIT_DELTA)){
            throw new IllegalArgumentException("Incorrect delta: " + delta);
        }
    }
}
