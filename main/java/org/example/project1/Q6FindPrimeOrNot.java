package org.example.project1;

public class Q6FindPrimeOrNot {
    public static void main(String[] args) {

        int number=13;
        boolean isPrime=true;

        for(int i=2; i<number; i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime);

    }
}
