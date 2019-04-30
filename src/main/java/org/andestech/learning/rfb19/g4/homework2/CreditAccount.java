package org.andestech.learning.rfb19.g4.homework2;

import java.util.Random;

public class CreditAccount extends Account {

    private CreditAccount(int accountId, Customer customer, double balance) {
        this.accType = AccountType.CreditAccount;
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(balance);
    }

    public static CreditAccount createAccount(int accountId, Customer customer, double balance) {
        if (customer.getAge() < 18 || customer.getAge() > 65) {
            System.out.printf("Account ID: [%d] Несоответствие возраста! balance: [%,.2f] %s\n", accountId, balance, customer);
            return null;
        }
        if (!customer.isCreditHistoryGood()) {
            System.out.printf("Account ID: [%d] Плохая кредитная история! balance: [%,.2f] %s\n", accountId, balance, customer);
            return null;
        }
        if (balance < AccountType.CreditAccount.getLimitLow() || balance > AccountType.CreditAccount.getLimitHigh()) {
            System.out.printf("Account ID: [%d] Недопустимый баланс! balance: [%,.2f] %s\n", accountId, balance, customer);
            return null;
        }
        if (accountId < 1) {
            System.out.printf("Account ID: [%d] Недопустимый ID! balance: [%,.2f] %s\n", accountId, balance, customer);
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
