package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App 
{
    private static int id = 1;

    public static void main( String[] args )
    {
        Customer validCustomer = new Customer("Elon", "Musk", 47, "LA");
        Customer invalidCustomer = new Customer("Elon", "Musk", 15, "LA");

        createAccount(validCustomer);
        createAccount(invalidCustomer);


    }

    public static Account createAccount(Customer customer){
        System.out.println("Create credit account:");
        Account account = CreditAccount.createCreditAccount(id++, customer);
        System.out.println(account);
        System.out.println("----------------------------");

        return account;
    }
}
