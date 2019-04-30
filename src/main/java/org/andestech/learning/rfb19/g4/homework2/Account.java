package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {
    private int accountId;
    private double balance;
    private Customer customer;
    protected AccountType accType;

    public abstract boolean withdrawal(double amount);
    public abstract boolean putMoney(double amount);

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (checkLimits(balance))
            this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountType getAccType() {
        return accType;
    }

    @Override
    public String toString() {
        return String.format("ID: [%d] balance: [%,.2f] [%s]", accountId, balance, customer);
    }

    public boolean checkLimits(double balance) {
        double limitLow, limitHigh;

        limitLow = accType.getLimitLow();
        limitHigh = accType.getLimitHigh();

        if (balance <  limitLow) {
            System.out.printf("Остаток упадет ниже минимума (%,.2f). Операция отклонена! %s\n", balance, this);
            return false;
        }
        if (balance > limitHigh) {
            System.out.printf("Превышен лимит средств на счете (%,.2f). Операция отклонена! %s\n", balance, this);
            return false;
        }

        return true;
    }

    public boolean checkWithdrawal(double amount, AccountType accType) {
        double limitWithdrawal = accType.getLimitWithdrawal();

        if (amount > limitWithdrawal) {
            System.out.printf("Превышен лимит снятия средств (%,.2f). Операция отклонена! %s\n", amount, this);
            return false;
        }

        return checkLimits(balance - amount);
    }

    public boolean checkPutMoney(double amount) {
        return checkLimits(balance + amount);
    }
}
