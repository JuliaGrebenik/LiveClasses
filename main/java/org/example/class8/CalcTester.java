package org.example.class8;

public class CalcTester {
    public static void main(String[] args) {


        Calculator c = new Calculator();

        int result = c.add(10, 10);
        if (result > 15) {
            System.out.println("You won the lottery");


        }
        String s=new String("Java is easy");
        boolean r=s.contains("Java");
        if(r){
            System.out.println("String is present");
        }
    }
}

