package org.example.project1;

public class Q9SecondLargestNumber {

    public static void main(String[] args) {

        int[] temperatures = {90, 105, 45, 88, 100, 110, 98};
        int largest = temperatures[0];
        int secondLargest = temperatures[0];


        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > largest) {
                secondLargest = largest;
                largest = temperatures[i];
            } else if (temperatures[i] > secondLargest && temperatures[i] != largest) {
                secondLargest = temperatures[i];
            }
        }
        System.out.println(secondLargest);
    }
    }



