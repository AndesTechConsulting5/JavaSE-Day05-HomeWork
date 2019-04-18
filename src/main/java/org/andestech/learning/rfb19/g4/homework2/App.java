package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer Ivan = new Customer("Иван","Иванов","Салтыково-Щедрина д 21 кв 86",25);
        System.out.println(Ivan);

        Customer Petr = new Customer("Петр","Петров","Умпа-лумпы д 33 кв 56",85);

        DebitAccount De_Ivan = new DebitAccount(Ivan,50_000);
        System.out.println(De_Ivan);

        DebitAccount DePetr = new DebitAccount(Petr,90_000);
        System.out.println(DePetr);


        DePetr.putMoney(1000);
        System.out.println(DePetr);

        DePetr.withdrawal(1000);

        CreditAccount  Cre_Petr = CreditAccount.CreateCredit(Petr,120_000);
        System.out.println(Cre_Petr );
    }
}
