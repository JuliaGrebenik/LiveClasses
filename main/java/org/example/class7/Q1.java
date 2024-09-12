package org.example.class7;

public class Q1 {

    public static void main(String[] args) {

        String userName="User123";
        String password="pass123";
        String confirmPassword="pass123";



        if(userName.isEmpty()||password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        }
        else if(password.length()<8){
            System.out.println("Password is too short");

        }

    }
}
