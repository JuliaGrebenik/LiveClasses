package org.example.project1;

public class Q3EvenElements {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {2, 5, 10},
                {3, 5},
                {25, 45, 66, 50}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //j<numbers[i].length shows how many columns(numbers) in each row
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }

        }
    }
}

