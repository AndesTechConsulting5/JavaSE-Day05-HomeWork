package org.andestech.learning.rfb19.g4.homework2;

public class Customer {
    private String firstName;
    private String secondName;
    private String address;
    private int age;


    public Customer(String firstName,String secondName, String address, int age) {
        this.firstName = firstName;
        this.secondName=secondName;
        this.address = address;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}


