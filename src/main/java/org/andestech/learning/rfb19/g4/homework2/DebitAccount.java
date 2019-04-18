package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account{

    private static final String TYPE_ACCOUNT = "debit";
    private static final double MIN_DELTA = 1,
                                MAX_DELTA = 100_000,
                                MIN_BALANCE = 10,
                                MAX_BALANCE = 10_000_000;

    public DebitAccount(Customer customer, double balance, int accountId) {
        super(customer, balance, accountId);
    }

    @Override
    public void putMoney(double delta) {
        if (checkDelta(TYPE_ACCOUNT, delta, MIN_DELTA, MAX_DELTA) && checkLimit(TYPE_ACCOUNT, delta, MIN_BALANCE, MAX_BALANCE)){
            super.putMoney(delta);
        }
    }

    @Override
    public void withdrawal(double delta) {
        if (checkDelta(TYPE_ACCOUNT, delta, MIN_DELTA, MAX_DELTA) && checkLimit(TYPE_ACCOUNT, delta, MIN_BALANCE, MAX_BALANCE)){
            super.withdrawal(delta);
        }
    }
}
