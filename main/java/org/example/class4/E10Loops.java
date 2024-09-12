package org.example.class4;

import java.util.Scanner;

public class E10Loops {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a Number");
        int number=scanner.nextInt();
        while(number>10){
            System.out.println("Please enter a Number ");
            number=scanner.nextInt();
        }
        }


    }

