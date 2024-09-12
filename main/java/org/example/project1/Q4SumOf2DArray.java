package org.example.project1;

public class Q4SumOf2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {2, 5, 10,20,10,10,55},
                {3, 5},
                {25, 45, 66, 50}
        };
        int oddSum=0;
        int evenSum=0;

        for (int[]row:numbers) {
            for (int n : row) {
                if (n % 2 == 0) {
                    evenSum += n;
                } else {
                    oddSum += n;
                }
            }
        }
                    System.out.println(oddSum);
            System.out.println(evenSum);
                }
    }


