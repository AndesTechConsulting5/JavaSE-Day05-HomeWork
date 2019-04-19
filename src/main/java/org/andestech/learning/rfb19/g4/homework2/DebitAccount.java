package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account {

    private static final double LIM_DBT_IN = 500;  // лимит снятия
    private static final double LIM_DBT_REST = 50; // лимит остатка
    private static final double LIM_DBT_EXC = 10000; // лимит избытка

    // constructor
    public DebitAccount(int accountId, double balance, Customer customer) {
        super(accountId, balance, customer);
    }

    @Override
    public void withdrawal(double cash) {

        if ((cash < LIM_DBT_IN) && (getBalance() - cash > LIM_DBT_REST) && (getBalance() + cash < LIM_DBT_EXC)) {

            setBalance(getBalance() - cash);
            System.out.println(" withdrawal OK");
        } else {
            System.out.println(" withdrawal OK");
        }
    }





    @Override
    public void putMoney(double cash) {

        setBalance( getBalance() + cash );
    }



}






/*

    public boolean isDeltaValid (double delta){
        return isDeltaValid ;
    }


    public void setBalance (double balance){

        this.balance = balance;
    }
    /*

     Реализовать методы withdrawal, putMoney.

     Конструктор в классе DebitAccount сделать открытым.

     Создать закрытые статические поля (константные) в классах счетов,
     определяющие лимиты по снятию средств, а также лимиты по остаткам и избыткам.

     */

