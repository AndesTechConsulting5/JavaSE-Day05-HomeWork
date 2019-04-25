package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App 
{
    private static int id = 1;

    public static void main( String[] args ) {
        Customer validCustomer = new Customer("Elon", "Musk", 47, "LA");
        Customer invalidCustomer = new Customer("Elon", "Musk", 15, "LA");

        System.out.println("Create credit account:");
        Account valid = CreditAccount.createCreditAccount(id++, validCustomer);
        System.out.println(valid);
        System.out.println("----------------------------");
        Account invalid = CreditAccount.createCreditAccount(id++, invalidCustomer);
        System.out.println(invalid);
        System.out.println("----------------------------");
    }
}
