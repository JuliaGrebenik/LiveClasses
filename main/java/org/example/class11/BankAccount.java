package org.example.class11;

public class BankAccount {
    private String customerNames;
    private String userName;
    private String password;
    private double accountBalance;

    public String getCustomerNames(){
        return customerNames;
    }
    public void setAccountBalance(double accountBalance){
this.accountBalance=accountBalance;
    }
    public BankAccount (String customerNames, String userName, String password, double accountBalance){
        this.customerNames=customerNames;
        this.userName=userName;
        this.password=password;
        this.accountBalance=accountBalance;


    }



    void login(){

    }

}
