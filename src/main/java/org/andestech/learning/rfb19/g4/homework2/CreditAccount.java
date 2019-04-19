package org.andestech.learning.rfb19.g4.homework2;

public class CreditAccount extends Account {

    private static final double MIN_AGE = 18;

    private static final double LIM_CRD_IN = 400, LIM_CRD_REST = 10, LIM_CRD_EXC = 50000;


    // constructor
    private CreditAccount(int accountId, double balance, Customer customer) {
        super(accountId, balance, customer);
    }



    static CreditAccount create( int accountId, double balance, Customer customer ) {
        if (customer.getAge() > MIN_AGE && customer.isHistory()) {
            System.out.println("Creating account");
            return new CreditAccount(accountId, balance, customer);
        } else {
            System.out.println("Age is out of range OR History");
            return null;
        }
    }



    @Override
    public void withdrawal(double cash) {

    }

    @Override
    public void putMoney(double cash) {

    }

    

    /*

    Реализовать методы withdrawal, putMoney.

Конструктор в классе CreditAccount сделать закрытым. Создание счёта сделать через фабричный метод.
При этом в методе должна проверяться "кредитная история", возраст
и в случае отказа (несоответствия выбраннам параметрам - решите сами, каким), счёт создаваться не должен.

Создать закрытые статические поля (константные) в классах счетов,
 определяющие лимиты по снятию средств, а также лимиты по остаткам и избыткам.

     */

}


