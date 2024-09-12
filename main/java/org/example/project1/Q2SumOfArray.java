package org.example.project1;

public class Q2SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 32, 55, 80, 100};
        int sum = 0;
        for (int i : arr) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
