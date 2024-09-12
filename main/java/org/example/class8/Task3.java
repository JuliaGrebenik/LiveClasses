package org.example.class8;

public class Task3 {
    public static void main(String[] args) {

        String s = "mom";

    }


        void checkpalindrome (String originalStr){

        StringBuilder sb=new StringBuilder (originalStr);
        String reversedStr=sb.reverse().toString();
        if (originalStr.equals(reversedStr)){
            System.out.println("This String is palindrone");


        }else{
            System.out.println("This String is not palindrome");
        }


    }





}
