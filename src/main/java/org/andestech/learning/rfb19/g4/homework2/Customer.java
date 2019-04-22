package org.andestech.learning.rfb19.g4.homework2;

public class Customer {

    //vars
    private String FirstName;
    private String SecondName;
    private int age;
    private String address;

    //constructor Customer
    public Customer(String Firstname, String SecondName, int age, String address) {
        this.FirstName = Firstname;
        this.SecondName = SecondName;
        this.age = age;
        this.address = address;
    }

    //setters and getters for vars
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
