package org.example.project1;

public class Q3Part2EvenElements {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {2, 5, 10},
                {3, 5},
                {25, 45, 66, 50}
        };

        for (int[]row:numbers) {
            for (int n : row) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }

            }
        }
                }
            }





