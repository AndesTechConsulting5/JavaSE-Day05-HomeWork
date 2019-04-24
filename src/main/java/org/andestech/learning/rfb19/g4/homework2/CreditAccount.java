package org.andestech.learning.rfb19.g4.homework2;

import java.util.Random;

public class CreditAccount extends Account {

    private static final int MIN_BALANCE = 50, MAX_BALANCE = 100_000;
    private static final int MIN_AGE = 18, MAX_AGE = 60;

    @Override
    public double withdrawal(double money) {
        double newBalance = getBalance() - money;
        if (newBalance < MIN_BALANCE){
            System.out.println("Баланс не может быть меньше допустимого минимума в " + MIN_BALANCE + " рублей.");
            return getBalance();
        } else if (newBalance > MAX_BALANCE){
            System.out.println("Баланс не может превышать допустимый максимум в " + MAX_BALANCE + " рублей.");
            return getBalance();
        }
        setBalance(newBalance);
        return newBalance;
    }

    @Override
    public double putMoney(double money) {
        double newBalance = getBalance() + money;
        if (newBalance < MIN_BALANCE){
            System.out.println("Баланс не может быть меньше допустимого минимума в " + MIN_BALANCE + " рублей.");
            return getBalance();
        } else if (newBalance > MAX_BALANCE){
            System.out.println("Баланс не может превышать допустимый максимум в " + MAX_BALANCE + " рублей.");
            return getBalance();
        }
        setBalance(newBalance);
        return newBalance;
    }

    Random random = new Random();
    int cr = random.nextInt(999_999);

    private CreditAccount(Customer customer) {
        this.setCustomer(customer);
        this.setBalance(50);
        this.setAccountId(cr);
    }

    @Override
    public String toString() {
        return getCustomer().toString() + "; На сумму = " + getBalance() + " руб.; ID = " + getAccountId();
    }

    public static CreditAccount createAcc(boolean ch, Customer customer) {
        if (ch == true && customer.getAge() >= MIN_AGE && customer.getAge() <= MAX_AGE) {
            System.out.println("Счет успешно открыт.");
            return new CreditAccount(customer);
        } else if (ch != true){
            System.out.println("Счет не может быть открыт, плохая кредитная история.");
            return null;
        } else if (customer.getAge() < MIN_AGE) {
            System.out.println("Счет не может быть открыт, клиент моложе 18 лет.");
            return null;
        } else if (customer.getAge() > MAX_AGE) {
            System.out.println("Счет не может быть открыт, клиент старше 60 лет.");
            return null;
        }
         else {
            return null;
        }
    }
}