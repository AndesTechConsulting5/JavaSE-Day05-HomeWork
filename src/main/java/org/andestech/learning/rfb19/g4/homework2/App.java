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
        Customer customer2 = new Customer("Петр", "Петров", "ул. Коммунистическая, 8", 48, false);
        Customer customer3 = new Customer("Сидор", "Сидоров", "ул. Колхозная, 2", 17, true);
        Customer customer4 = new Customer("Модест", "Модестов", "ул. Пролетарская, 56", 78, false);

        // дебетовый счет с нулевым остатком
        DebitAccount dbAccount1 = new DebitAccount(1, customer1);
        // превышение верхнего лимита по дебетовому счету
        DebitAccount dbAccount2 = new DebitAccount(2, customer1, 100_000_000);
        // создание дебетового счета с отрицательным остатком
        DebitAccount dbAccount3 = new DebitAccount(3, customer1, -1);

        // кредитовый счет
        CreditAccount crAccount1 = CreditAccount.createAccount(4, customer1, 10_000);
        // плохая кредитная история
        CreditAccount crAccount2 = CreditAccount.createAccount(5, customer2, 10_000);
        // возраст ниже требуемого
        CreditAccount crAccount3 = CreditAccount.createAccount(6, customer3, 10_000);
        // возраст выше требуемого
        CreditAccount crAccount4 = CreditAccount.createAccount(7, customer4, 10_000);
        // баланс ниже лимита
        CreditAccount crAccount5 = CreditAccount.createAccount(8, customer1, 100);
        // баланс выше лимита
        CreditAccount crAccount6 = CreditAccount.createAccount(9, customer1, 100_000_000);

        // пополнение
        dbAccount1.putMoney(100);
        // снятие
        dbAccount1.withdrawal(100);
        // овердрафт
        dbAccount1.withdrawal(1);
        // выше лимита
        dbAccount1.withdrawal(100_000_000);

        // пополнение
        crAccount1.putMoney(10_000);
        // снятие
        crAccount1.withdrawal(10_000);
        // овердрафт
        crAccount1.withdrawal(10_001);
        // превышение лимита снятия
        crAccount1.putMoney(30_000);
        crAccount1.withdrawal(30_000);
        // выше лимита
        crAccount1.putMoney(10_000_000);

        System.out.println(dbAccount1);
        System.out.println(dbAccount2);
        System.out.println(dbAccount3);

        System.out.println(crAccount1);
        System.out.println(crAccount2);
        System.out.println(crAccount3);
        System.out.println(crAccount4);
        System.out.println(crAccount5);
        System.out.println(crAccount6);

    }
}
