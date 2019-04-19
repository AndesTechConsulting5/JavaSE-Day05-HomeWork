package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App
{
    static int id=0;
    public static void main(String[] args )
    {

        Customer customer = new Customer("Ivan","Gromov",10,"Moscow");

        int balance = 1;

        Account newAccount = createAccount(10,customer);

        if (newAccount instanceof CreditAccount) {
            System.out.println("CreditAccount");
        } else {
            System.out.println("DebitAccount");
        }



    }



    public static Account createAccount (float balance, Customer customer) {
        if (balance<0) {
            return CreditAccount.createCreditAccount(++id,customer,balance);
        } else {
            return DebitAccount.createCreditAccount(++id,customer,balance);
        }

    }
}
