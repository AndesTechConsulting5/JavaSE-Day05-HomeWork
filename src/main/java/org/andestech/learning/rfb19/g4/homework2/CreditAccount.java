package org.andestech.learning.rfb19.g4.homework2;

public class CreditAccount extends Account {

    private static final String TYPE_ACCOUNT = "credit";
    private static final int MIN_AGE = 14;
    private static final double MIN_DELTA = 0,
                                MAX_DELTA = 10_000,
                                MIN_BALANCE = -1_000,
                                MAX_BALANCE = 50_000;

    private CreditAccount(Customer customer, double balance, int accountId) {
        super(customer, balance, accountId);
    }

    public static CreditAccount createCreditAccount(boolean isCreditHistoryCorrect, int customerAge, Customer customer, double balance, int accountId){
        if(isCreditHistoryCorrect && customerAge >= MIN_AGE){
            return new CreditAccount(customer, balance, accountId);
        } else {
            System.out.println("Can't open credit account because credit history or age is not valid!\n" + "credit history = " + isCreditHistoryCorrect + " age = " + customerAge);
            return null;
        }
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
