package org.andestech.learning.rfb19.g4.homework2;

import java.util.Objects;

public class CreditCustomerValidator {

    private static final int MIN_AGE = 21;
    private static final int MAX_AGE = 65;

    public static boolean checkCustomer(Customer customer){
        checkAge(customer);
        checkAddress(customer);
        checkBKI(customer);

        return true;
    }

    public static void checkAddress(Customer customer) {
        if(Objects.isNull(customer.getAddress()))
            throw new IllegalArgumentException("Address must not be null");
    }

    public static void checkAge(Customer customer) {
        int age = customer.getAge();
        if(MIN_AGE > age || age > MAX_AGE)
            throw new IllegalArgumentException("Age incorrect:" + age);
    }

    public static void checkBKI(Customer customer) {
        //....

    }
}
