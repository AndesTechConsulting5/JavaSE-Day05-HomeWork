package org.andestech.learning.rfb19.g4.homework2;

public class CreditAccount extends Account {

    private static final int MIN_AGE = 14;

    private CreditAccount(int accountId, Customer customer, double balance) {
        this.accType = AccType.CreditAccount;
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(balance);
    }

    public static CreditAccount createCreditAccount(boolean isCreditHistoryCorrect, int customerAge, Customer customer, double balance, int accountId){
        if(isCreditHistoryCorrect && customerAge <= MIN_AGE){
            System.out.println("Can't open credit account because credit history or age is not valid!\n" + "credit history = " + isCreditHistoryCorrect + " age = " + customerAge);
            return null;
        }
        return new CreditAccount(accountId, customer, balance);
    }

    @Override
    public void putMoney(double sum) {
        if (checkDelta(sum) && checkLimit(getBalance() + sum)){
            super.putMoney(sum);
        }
    }

    @Override
    public void withdrawal(double sum) {
        if (checkDelta(sum) && checkLimit(getBalance() - sum)){
            super.withdrawal(sum);
        }
    }
}
