package org.example.class7;

public class E3String {
    public static void main(String[] args) {


        String s="afhasdaklsdjdwld";
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a'){
                count++;
                System.out.println(count);
            }

        }

    }
}
