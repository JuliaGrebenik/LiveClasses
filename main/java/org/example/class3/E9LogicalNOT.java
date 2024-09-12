package org.example.class3;

public class E9LogicalNOT {
    public static void main(String[] args) {

        String country = "Iran";
        if (!country.equals("iran") && !country.equals("Korea")) {
            System.out.println("You can visit USA");
        }
        if (country.equals("UK") && !country.equals("Spain")) {
            System.out.println("You can visit USA");
        }
    }
}
