package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App

{
    public static void main( String[] args ) {
        Customer customer1 = new Customer("Alexander", "Baryshev", "Moscow", 18);
        System.out.println(CreditAccount.createAcc(true,customer1));
        System.out.println(CreditAccount.createAcc(false,customer1));
        Customer customer2 = new Customer("Vladimir", "Ivanov", "Voronezh", 17);
        System.out.println(CreditAccount.createAcc(true,customer2));
        Customer customer3 = new Customer("Ivan", "Popov", "Riga", 61);
        System.out.println(CreditAccount.createAcc(true,customer3));

        System.out.println("------------------------Проверка дебетового счета-----------------------");
        DebitAccount debitAccount = new DebitAccount(customer1);
        System.out.println(debitAccount.putMoney(1000));
        System.out.println(debitAccount.putMoney(1000000));
        System.out.println(debitAccount.withdrawal(99.99f));
        System.out.println(debitAccount.withdrawal(800.01f));
        System.out.println(debitAccount.withdrawal(1));

        System.out.println("------------------------Проверка кредитного счета-----------------------");
        // в разработке, пока не получилось


    }
}
