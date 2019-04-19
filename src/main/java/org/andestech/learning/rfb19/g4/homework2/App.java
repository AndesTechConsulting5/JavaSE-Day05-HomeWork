package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer1 = new Customer("Иван", "Иванов", "ул. Ленина, 32", 32, true);
        Customer customer2 = new Customer("Петр", "Петров", "ул. Коммунистическая, 8", 48, true);
        Customer customer3 = new Customer("Сидор", "Сидоров", "ул. Колхозная, 2", 17, true);
        Customer customer4 = new Customer("Модест", "Модестов", "ул. Пролетарская, 56", 78, false);

        DebitAccount dbAccount1 = new DebitAccount(1, customer1);
        DebitAccount dbAccount2 = new DebitAccount(2, customer2);
        DebitAccount dbAccount3 = new DebitAccount(3, customer3);
        DebitAccount dbAccount4 = new DebitAccount(4, customer4);

        CreditAccount crAccount1 = CreditAccount.createAccount(5, customer1, 10_000);
        CreditAccount crAccount2 = CreditAccount.createAccount(6, customer2, 10_000);
        CreditAccount crAccount3 = CreditAccount.createAccount(7, customer3, 10_000);
        CreditAccount crAccount4 = CreditAccount.createAccount(8, customer4, 10_000);

        CreditAccount crAccount5 = CreditAccount.createAccount(9, customer1, 100);
        CreditAccount crAccount6 = CreditAccount.createAccount(10, customer1, 100_000_000);

        dbAccount1.putMoney(100);
        dbAccount1.withdrawal(1000);

        dbAccount2.putMoney(10_000);
        dbAccount2.withdrawal(1000);

        crAccount1.withdrawal(1000);
        crAccount1.withdrawal(10_000);
        crAccount1.withdrawal(15_000);
        crAccount1.putMoney(10_000);
        crAccount1.putMoney(10_000_000);

        System.out.println(dbAccount1);
        System.out.println(dbAccount2);
        System.out.println(dbAccount3);
        System.out.println(dbAccount4);

        System.out.println(crAccount1);
        System.out.println(crAccount2);
        System.out.println(crAccount3);
        System.out.println(crAccount4);
        System.out.println(crAccount5);
        System.out.println(crAccount6);

    }
}
