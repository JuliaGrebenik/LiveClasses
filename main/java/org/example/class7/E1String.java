package org.example.class7;

public class E1String {
    public static void main(String[] args) {

        String str=new String("Computers");
        str.length(); //we are calling the length methos using the str objiect
        System.out.println(str.length());
        int len=str.length();
        if(len>3){
            System.out.println("Accepted");
        }
    }

}