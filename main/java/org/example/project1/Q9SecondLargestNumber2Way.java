package org.example.project1;

public class Q9SecondLargestNumber2Way {

    public static void main(String[] args) {

        int[] temperatures = {90, 105, 45, 88, 100, 110, 98};
        int largest = temperatures[0];
        int secondLargest = temperatures[0];


        for (int n: temperatures) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest =n;
            }
        }
        System.out.println(secondLargest);
    }
    }



