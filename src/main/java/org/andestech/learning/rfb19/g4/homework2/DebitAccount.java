package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

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
        if (!checkPutMoney(amount))
            return false;

        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public String toString() {
        return "{" + accType + " " + super.toString() + "}";
    }
}
