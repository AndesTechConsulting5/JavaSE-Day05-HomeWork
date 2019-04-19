package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    private DebitAccount(int id, Customer customer, float balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    @Override
    float withdrawal(float money) {
        return 0;
    }

    @Override
    float putMoney(float money) {
        return 0;
    }

    public static DebitAccount createCreditAccount (int id, Customer customer, float balance) {
        if (balance < 0) {
            System.out.println("счет не создан, слишком низкий баланс");
            return null;
        }
        return new DebitAccount(id, customer, balance);
    }
}
