package org.andestech.learning.rfb19.g4.homework2;

import java.util.Random;

public class DebitAccount extends Account {

    private static final int MIN_BALANCE = 100, MAX_BALANCE = 1_000_000;

    Random random = new Random();
    int dr = random.nextInt(999_999);

    public DebitAccount(Customer customer){
        this.setCustomer(customer);
        this.setBalance(0);
        this.setAccountId(dr);
    }

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
        public double putMoney ( double money){
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
    }