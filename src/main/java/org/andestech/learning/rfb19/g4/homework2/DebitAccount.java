package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    private static final int MIN_BALANCE = 100, MAX_BALANCE = 1_000_000;

    public DebitAccount(Customer customer){
        this.setCustomer(customer);
        this.setBalance(0);
        this.setAccountId(001);
    }

    @Override
    public float withdrawal(float money) {
        float newBalance = getBalance() - money;
        boolean res = true;
        if (newBalance < MIN_BALANCE){
            res = false;
            System.out.println("Баланс не может быть меньше допустимого минимума - " + MIN_BALANCE + " рублей");
            return getBalance();
        } else if (newBalance > MAX_BALANCE){
            res = false;
            System.out.println("Баланс не может превышать допустимый максимум - " + MAX_BALANCE + " рублей");
            return getBalance();
        }
        setBalance(newBalance);
        return newBalance;
    }

        @Override
        public float putMoney ( float money){
            float newBalance = getBalance() + money;
            boolean res = true;
            if (newBalance < MIN_BALANCE){
                res = false;
                System.out.println("Баланс не может быть меньше допустимого минимума - " + MIN_BALANCE + " рублей");
                return getBalance();
            } else if (newBalance > MAX_BALANCE){
                res = false;
                System.out.println("Баланс не может превышать допустимый максимум - " + MAX_BALANCE + " рублей");
                return getBalance();
            }
            setBalance(newBalance);
            return newBalance;
        }

    }