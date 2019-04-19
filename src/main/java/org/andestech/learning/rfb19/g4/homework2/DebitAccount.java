package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    static final double LIMIT_LOW = 0;
    static final double LIMIT_HIGH = 10_000_000;
    static final double LIMIT_WITHDRAWAL = 30_000;

    public DebitAccount(int accountId, Customer customer, double balance) {
        this.accType = AccountType.DebitAccount;
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(balance);
    }

    public DebitAccount(int accountId, Customer customer) {
        this(accountId, customer, 0);
    }

    @Override
    public boolean withdrawal(double amount) {
        if (!checkWithdrawal(amount, this.getAccType()))
            return false;

        setBalance(getBalance() - amount);
        return true;
    }

    @Override
    public boolean putMoney(double amount) {
        if (!checkPutMoney(amount, this.getAccType()))
            return false;

        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public String toString() {
        return this.accType + " " + super.toString();
    }
}
