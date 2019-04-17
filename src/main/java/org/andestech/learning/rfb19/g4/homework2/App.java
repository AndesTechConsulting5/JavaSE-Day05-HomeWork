package org.andestech.learning.rfb19.g4.homework2;


/**
 * HomeWork 2
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //задан клиент
        Customer client1 = new Customer ("Иван", "Петров", "ул.Ленина, д.1",20);
        //с дебетовым счетом
    //    DebitAccount debit1 = new DebitAccount(1, 1000, client1);

        //открываем дебетовый счет с суммой 100 клиенту 1
        DebitAccount debit1 = new DebitAccount();
        debit1.debitAccount(1,100, client1);

        //пополняем дебетовый счет клиенту 1
        debit1.putMoney(1500);

        //снимает деньги с дебетового счета у клиента 1
        debit1.withdrawal(500);










    }
}
