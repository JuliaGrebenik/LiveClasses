package org.example.class12;

import java.util.ArrayList;
import java.util.Arrays;

public class E3ArrayList {
    public static void main(String[] args) {


        int[] nums=new int [5];
        nums[0]=50;
        System.out.println(Arrays.toString(nums));



        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
    }
}
