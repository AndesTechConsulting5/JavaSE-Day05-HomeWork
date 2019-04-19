package org.andestech.learning.rfb19.g4.homework2;

public class CreditAccount extends Account implements New_Account {

    private static final double MAX_DELTA = 30_000, MIN_DELTA = 1,
                                MAX_CREDIT = 1_000_000;

    @Override
    public void withdrawal(double delta) {
        if(IsDeltaValid(delta) && (this.balance - delta) > 0)
        {SetBalance(this.balance - delta);
            System.out.println("Операция на " + delta + ". Остаток " + (this.balance));}
    }

    @Override
    public void putMoney(double delta) {
        if ((this.balance + delta) > MAX_CREDIT) {
            SetBalance(this.balance + delta);
            System.out.println("Баланс пополнен на " + delta + ". Остаток " + (this.balance));}
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

    //закрытый конструктор123
    private CreditAccount(Customer customer, double balance) {
        super(customer,balance);
}

    //обращаемся к закрытому конструктору
    static CreditAccount CreateCredit (Customer customer, double balance)
    {return new CreditAccount(customer,balance);}



    @Override
    public void Create_Account() {


    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}


//    public class Example {
//        private Example() { System.out.println("Hello World");}
//    static Example create() { return new Example();}


