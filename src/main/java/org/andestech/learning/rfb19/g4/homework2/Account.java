package org.andestech.learning.rfb19.g4.homework2;

enum AccountType { DebitAccount, CreditAccount}

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
        return String.format("ID: %d balance: %,.2f %s", accountId, balance, customer);
    }

    public boolean checkLimits(double balance) {
        double limitLow = 0, limitHigh = 0;

        switch (accType) {
            case DebitAccount:
                limitLow = DebitAccount.LIMIT_LOW;
                limitHigh = DebitAccount.LIMIT_HIGH;
                break;
            case CreditAccount:
                limitLow = CreditAccount.LIMIT_LOW;
                limitHigh = CreditAccount.LIMIT_HIGH;
        }

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
        double limitWithdrawal = (accType == AccountType.DebitAccount) ?
                DebitAccount.LIMIT_WITHDRAWAL :
                CreditAccount.LIMIT_WITHDRAWAL;

        if (amount > limitWithdrawal) {
            System.out.printf("Превышен лимит снятия средств (%,.2f). Операция отклонена! %s\n", amount, this);
            return false;
        }

        return checkLimits(balance - amount);
    }

    public boolean checkPutMoney(double amount, AccountType accType) {
        return checkLimits(balance + amount);
    }
}
