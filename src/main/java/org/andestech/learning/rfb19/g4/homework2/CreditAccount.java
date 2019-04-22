package org.andestech.learning.rfb19.g4.homework2;

public class CreditAccount extends Account {

    private CreditAccount(int accountId, Customer customer, double balance) {
        super(accountId, customer, balance);
    }

    //Factory Method
    public static class FactoryMethod implements org.andestech.learning.rfb19.g4.homework2.FactoryMethod {
        CreditAccount createAccount(int id, Customer customer, double balance) {
            if (customer.getAge() >= Account.getAdult()) {
                System.out.println("Кредитный счёт пополнен" + balance);
                return new CreditAccount(id, customer, balance);
            } else {
                System.out.println("Клиент не совершеннолетний");
                return null;
            }
        }
    }

    @Override
    public void putMoney(double cash) {
        System.out.println("Снимаем деньги с кредитного счета.");
        if (DebitAccount.CheckBalance(cash)) {
            double balance = getBalance() - cash;
            setBalance(balance);
            System.out.println("На счету " + balance);
        }
    }

    @Override
    public void withdraw(double cash) {
        System.out.println("Кладем деньги на дебетовый счет.");
        if (DebitAccount.CheckBalance(cash)) {
            double balance = getBalance() + cash;
            setBalance(balance);
            System.out.println("На счету " + balance);
        }
    }
}