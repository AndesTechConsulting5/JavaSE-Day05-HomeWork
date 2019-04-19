package org.andestech.learning.rfb19.g4.homework2;

public class DebitAccount extends Account implements New_Account {

    private static final double MAX_DELTA = 50_000, MIN_DELTA = 100,
                                MAX_BALANCE = 1_000_000, MIN_BALANCE = -1_000;

    public double delta;

//конструктор
    public DebitAccount(Customer customer, double balance) {
        super(customer,balance);
//        this.customer = customer;
//        this.balance = balance;

    }

    private void SetBalance(double balance){
        this.balance = balance;
    }

    private static boolean IsDeltaValid(double delta){
        if (delta >= MIN_DELTA && delta <= MAX_DELTA) {return true;}
        else {
            System.out.println("Транзакция на " + delta +" за границами лимитов, min " + MIN_DELTA + " max " + MAX_DELTA);
            return false;
        }
    }

    @Override
    public void withdrawal( double delta) {
        if(IsDeltaValid(delta) && (this.balance - delta) >= MIN_BALANCE)
        {SetBalance(this.balance - delta);
        System.out.println("Операция на " + delta + ". Остаток " + (this.balance - delta));}
    }



    @Override
    public void putMoney(double delta) {
        if ((this.balance + delta) > MAX_BALANCE) {
        SetBalance(this.balance + delta);
        System.out.println("Баланс пополнен на " + delta + ". Остаток " + (this.balance));}
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "customer=" + customer +
                ", balance=" + balance +
                ", accountId=" + accountId +
                '}';
    }

    @Override
    public void Create_Account() {

    }
}
