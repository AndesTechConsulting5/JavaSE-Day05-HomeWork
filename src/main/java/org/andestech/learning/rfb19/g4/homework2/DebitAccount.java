package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account{

    public DebitAccount(int accountId, Customer customer, double balance) {
        this.accType = AccType.DebitAccount;
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(balance);
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
