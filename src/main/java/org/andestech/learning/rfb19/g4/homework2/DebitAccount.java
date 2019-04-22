package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    public DebitAccount(int accountId, Customer customer, double balance) {
        super(accountId, customer, balance);
    }

    //Check balance
    public static boolean CheckBalance(double balance) {
        if(balance >=Account.getMinBalance()  && balance <= Account.getMaxBalance()) {
            return true;
        } else {
            System.out.println("Неверный баланс " + balance);
            return false;
        }
    }

    //Check Range
    public boolean CheckRange(double ChangeRange) {
        if(ChangeRange>=Account.getMinRange() && ChangeRange >= Account.getMinRange() && ChangeRange <= Account.getMaxBalance()) {
            return true;
        } else {
            System.out.println("Неправильная сумма :" + ChangeRange);
            return false;
        }
    }

    //Factory Method
    public class FactoryMethod implements org.andestech.learning.rfb19.g4.homework2.FactoryMethod {
        DebitAccount createAccount(int id, double balance, Customer customer) {
            if (customer.getAge() < Account.getAdult()) {
                System.out.println("Клиент не совершеннолетний");
                return null;
            } else {
                System.out.println("Создание дебетового счета: " + balance);
                return new DebitAccount(id, customer, balance);
            }
        }
    }

    @Override
    public void withdraw(double cash) {
        System.out.println("Снимаем деньги с дебетового счета.");
        if(CheckRange(cash)) {
            double balance = getBalance() - cash;
            if(balance>Account.getMinBalance()) {
                setBalance(balance);
                System.out.println("На счету " + balance);
            } else {
                System.out.println("Снятие такой суммы невозможно!");
            }

        }
    }

    @Override
    public void putMoney(double cash) {
        System.out.println("Снимаем деньги с дебетового счета.");
        if(CheckRange(cash)) {
            double balance = getBalance() - cash;
            if(balance>Account.getMinBalance()) {
                setBalance(balance);
                System.out.println("На счету " + balance);
            } else {
                System.out.println("Снятие такой суммы невозможно!");
            }
        }
    }
}
