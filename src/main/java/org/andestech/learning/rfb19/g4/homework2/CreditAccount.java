package org.andestech.learning.rfb19.g4.homework2;

import java.util.Random;

public class CreditAccount extends Account {

    static final double LIMIT_LOW = 1_000;
    static final double LIMIT_HIGH = 1_000_000;
    static final double LIMIT_WITHDRAWAL = 20_000;

    private CreditAccount(int accountId, Customer customer, double balance) {
        this.accType = AccountType.CreditAccount;
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(balance);
    }

    public static CreditAccount createAccount(int accountId, Customer customer, double balance) {
        if (customer.getAge() < 18 || customer.getAge() > 65) {
            System.out.printf("Account ID: %d Несоответствие возраста! %s balance: %,.2f\n", accountId, customer, balance);
            return null;
        }
        if (!customer.isCreditHistoryGood()) {
            System.out.printf("Account ID: %d Плохая кредитная история! %s balance: %,.2f\n", accountId, customer, balance);
            return null;
        }
        if (balance < CreditAccount.LIMIT_LOW || balance > CreditAccount.LIMIT_HIGH) {
            System.out.printf("Account ID: %d Недопустимый баланс! %s balance: %,.2f\n", accountId, customer, balance);
            return null;
        }
        if (accountId < 1) {
            System.out.printf("Account ID: %d Недопустимый ID! %s balance: %,.2f\n", accountId, customer, balance);
            return null;
        }

        return new CreditAccount(accountId, customer, balance);
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
