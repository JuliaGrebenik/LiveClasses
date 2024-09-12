package org.example.class3;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
        System.out.println("Please enter the price");
double price=input.nextDouble();
if(price>1000){
    System.out.println("It's expensive");
}else{
    System.out.println("It's not that expensive");
}
    }
}
