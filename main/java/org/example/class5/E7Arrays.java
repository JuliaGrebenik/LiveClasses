package org.example.class5;

public class E7Arrays {
    public static void main(String[] args) {
        //print found if number 0 is present


        int[] numbers = {10, 33, 20, 30, 45, 50, 20, 4, 5, 0, 8, 9, 666};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
                sum += numbers[i];
                System.out.println(numbers[i]);
                System.out.println(numbers[i]);
                System.out.println(numbers[i]);
                System.out.println(numbers[i]);
                System.out.println(numbers[i]);
                System.out.println(numbers[i]);

            }
        }
    }
}




