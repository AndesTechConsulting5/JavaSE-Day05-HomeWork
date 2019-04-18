package org.andestech.learning.rfb19.g4.homework2;

public class CreditAccount extends Account {

    private static final int MIN_BALANCE = 50, MAX_BALANCE = 100_000;

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
    public float putMoney(float money) {
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

    private CreditAccount(Customer customer) {
        this.setCustomer(customer);
        this.setBalance(1000);
        this.setAccountId(1);
    }

    @Override
    public String toString() {
        return getCustomer().toString() + " " + getBalance() + " " + getAccountId();
    }

    public static CreditAccount createAcc(boolean ch, Customer customer) {
        boolean res=true;
        if (ch == true && customer.getAge() >= 18 && customer.getAge() <= 60) {
            res = true;
            System.out.println("Счет успешно открыт");
        } else if (ch != true){
            res = false;
            System.out.println("Счет не может быть открыт, плохая кредитная история");
        } else if (customer.getAge() < 18) {
            res = false;
            System.out.println("Счет не может быть открыт, клиент моложе 18 лет");
        } else if (customer.getAge() > 60) {
            res = false;
            System.out.println("Счет не может быть открыт, клиент старше 60 лет");
        }
        if (res==true) {
            return new CreditAccount(customer);
        } else {
            return null;
        }
    }
}