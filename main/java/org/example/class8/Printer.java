package org.example.class8;

public class Printer {

    void greet() {
        System.out.println("Welcome to Syntax techs");
        System.out.println("Welcome to SDET course");
        System.out.println("Welcome to java classes");
        System.out.println("welcome to Sunday class");
        System.out.println("weolcome to Methods");
    }

    void printWord(String word) {
        System.out.println(word);
    }

    void checkDiscount(int age, double totalBill, char gender) {
        if (age < 20 & totalBill>1500) {
            System.out.println("you will get 20 % disc");
        } else if (age < 40 & totalBill>3000 || gender =='F') {
            System.out.println("you will get 40% disc");
        } else if (age < 60) {
            System.out.println("you will get 60% disc");


        }
    }
}



