package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {

    protected Customer customer;
    protected int id;
    protected float balance;

    abstract float withdrawal(float money);

    abstract float putMoney(float money);


}
