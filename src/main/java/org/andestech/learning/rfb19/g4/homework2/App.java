package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Customer cus1 = new Customer("Vlad", "Ovod", 22, "M", true );

        DebitAccount dbAcc_1 = new DebitAccount(1, 500, cus1 );

        dbAcc_1.putMoney( 100 );
        dbAcc_1.withdrawal(200);

        //String firstName, String secondName, int age, String address, boolean history)

    }
}
