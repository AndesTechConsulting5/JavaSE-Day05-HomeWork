package org.andestech.learning.rfb19.g4.homework2;

/**
 * HomeWork 2
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Customer cus1 = new Customer("Vladimir", "Ovod", 29, "M", true );


        DebitAccount dbAcc_1 = new DebitAccount(1, 500, cus1 );


       // 500;  // лимит снятия
       // 50; // лимит остатка
       // 10000; // лимит избытка

        dbAcc_1.putMoney( 100 );
        dbAcc_1.putMoney( 70000);

        dbAcc_1.withdrawal(200);
        dbAcc_1.withdrawal(2000);



        CreditAccount  crAcc_1 = CreditAccount.create(2, 10000, cus1 );

        crAcc_1.withdrawal( 100);
        crAcc_1.withdrawal( 9999999);

        crAcc_1.putMoney( 500 );
        crAcc_1.putMoney( 888888 );


        Customer cus2 = new Customer( "Vladimir", "Petrenko", 10, "S", true );
        Customer cus3 = new Customer("Vladimir", "Bonderenko", 27, "P", false);

        CreditAccount  crAcc_2 = CreditAccount.create(2, 10000, cus2 );
        CreditAccount  crAcc_3 = CreditAccount.create(2, 10000, cus3 );





    }
}
