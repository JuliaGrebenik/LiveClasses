package org.example.class11;

public class BankTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Fahad","fahad123","password123",100000);



        System.out.println(b.getCustomerNames());
        b.setAccountBalance(-1000);
    }
}
