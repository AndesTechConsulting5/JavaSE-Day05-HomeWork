package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    private static final double LIM_DBT_WDR  = 500;  // лимит снятия
    private static final double LIM_DBT_REST = 50; // лимит остатка
    private static final double LIM_DBT_EXC  = 10000; // лимит избытка

    // constructor
    public DebitAccount(int accountId, double balance, Customer customer) {
        super(accountId, balance, customer);

        System.out.println("Creating DEBIT account");
        System.out.println("Your balance is " + getBalance());
    }

    @Override
    public void withdrawal(double cash) {

        // менее лимита снятия и более лимита остатка
        if ((cash < LIM_DBT_WDR) && (getBalance() - cash > LIM_DBT_REST) ) {

            setBalance(getBalance() - cash);
            System.out.println(" [INFO] [DEBIT] withdrawal OK, balance setted to --> " + getBalance() );
        } else {
            System.out.println(" [ERROR] [DEBIT] withdrawal not succeful");
        }
    }





    @Override
    public void putMoney(double cash) {

        // не более лимита избытка
        if ( cash + getBalance() < LIM_DBT_EXC ){
            setBalance( getBalance() + cash );
            System.out.println(" [INFO] [DEBIT] putting money OK, balance setted to --> " + getBalance() );

        } else {
            System.out.println(" [ERROR] [DEBIT] putting money isn't succeful");
        }


    }



}