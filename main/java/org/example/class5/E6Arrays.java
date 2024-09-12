package org.example.class5;

public class E6Arrays {
    public static void main(String[] args) {
        //print found if number 0 is present


        int[] numbers = {10, 20, 30, 45, 50, 20, 4, 5, 0, 8, 9, 666};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 0) {
                System.out.println("found");
            }

        }
    }
}



