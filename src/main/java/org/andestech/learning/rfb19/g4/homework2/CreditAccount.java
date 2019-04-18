package org.andestech.learning.rfb19.g4.homework2;

import java.util.Objects;

public class CreditAccount extends Account {

    private CreditAccount(long accountId, Customer customer) {
        super(accountId, customer);
    }

    @Override
    public void withdrawal(double delta) {
        checkDelta(delta);
        setBalance(this.balance - delta);
    }

    @Override
    public void putMoney(double delta) {
        checkDelta(delta);
        setBalance(this.balance + delta);
    }

    public static CreditAccount createCreditAccount(long accountId, Customer customer){
        Objects.requireNonNull(customer, "Customer must not be null");
        CreditCustomerValidator.checkCustomer(customer);

        return new CreditAccount(accountId, customer);
    }

    @Override
    public String toString() {
        return String.format("Credit account[id: %d, customer: %s]", getAccountId(), getCustomer().toString());
    }
}
