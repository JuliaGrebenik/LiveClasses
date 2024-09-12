package org.example.class12;

import java.util.ArrayList;

public class E2ListDemo {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList=new ArrayList<>();
        addNumbers(10.5,10.5);


    }

    static void addNumbers(int a, int b){
        System.out.println(a+b);
    }
    static void addNumbers(double a,double b){
        System.out.println(a+b);
    }
}
