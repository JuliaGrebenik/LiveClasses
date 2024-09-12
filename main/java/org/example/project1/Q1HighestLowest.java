package org.example.project1;

public class Q1HighestLowest {
    public static void main(String[] args) {

        int[] temperatures = {90, 105, 45, 88, 100, 110, 98};
        int largest = temperatures[0];// we are assuming first number is largest
        int smallest=temperatures[0];//we are assuming first number is smallest
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > largest) {
                largest = temperatures[i];

            }
            if(temperatures[i]<smallest){
                smallest=temperatures[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}




