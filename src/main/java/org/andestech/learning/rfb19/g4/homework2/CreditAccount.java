package org.andestech.learning.rfb19.g4.homework2;

import java.util.Random;

public class CreditAccount extends Account {

    private static final double LIMIT_LOW = 1_000;
    private static final double LIMIT_HIGH = 1_000_000;
    private static final double LIMIT_WITHDRAWAL = 20_000;

    private CreditAccount(int accountId, Customer customer, double balance) {
        this.setAccountId(accountId);
        this.setCustomer(customer);
        this.setBalance(balance);
    }

    public static CreditAccount createAccount(int accountId, Customer customer, double balance) {
        if (customer.getAge() < 18 || customer.getAge() > 65) {
            System.out.println("Account ID: " + accountId + " Несоответствие возраста! " + customer + " balance: " + balance);
            return null;
        }
        if (!customer.isCreditHistoryGood()) {
            System.out.println("Account ID: " + accountId + " Плохая кредитная история! " + customer + " balance: " + balance);
            return null;
        }
        if (balance < CreditAccount.LIMIT_LOW || balance > CreditAccount.LIMIT_HIGH) {
            System.out.println("Account ID: " + accountId + " Недопустимый баланс! " + customer + " balance: " + balance);
            return null;
        }
        if (accountId < 1) {
            System.out.println("Account ID: " + accountId + " Недопустимый ID! " + customer + " balance: " + balance);
            return null;
        }

        return new CreditAccount(accountId, customer, balance);
    }

    @Override
    public boolean withdrawal(double amount) {
        if (amount > getBalance()) {
            System.out.println("Превышен кредитный лимит. Операция отклонена! " + this.toString());
            return false;
        }
        if (amount > CreditAccount.LIMIT_WITHDRAWAL) {
            System.out.println("Превышен лимит снятия средств. Операция отклонена! " + this.toString());
            return false;
        }
        if (getBalance() - amount < CreditAccount.LIMIT_LOW) {
            System.out.println("Снятие уменьшит остаток ниже лимита. Операция отклонена! " + this.toString());
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }

    @Override
    public boolean putMoney(double amount) {
        if (getBalance() + amount > CreditAccount.LIMIT_HIGH) {
            System.out.println("Превышен лимит средств на счете. Операция отклонена! " + this.toString());
            return false;
        }
        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public String toString() {
        return "Credit" + super.toString();
    }
}
