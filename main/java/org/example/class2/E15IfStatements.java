package org.example.class2;

public class E15IfStatements {
    public static void main(String[] args) {


        String name="James";
        if(name.equals("james")) {
            System.out.println(1);
        }else{
            System.out.println(2);


            if("james".equals(name)) {
                System.out.println(1);
            }else{
                System.out.println(2);



                if("james".equalsIgnoreCase(name)) {
                    System.out.println(1);
                }else{
                    System.out.println(2);
            }

            }



        }
    }
}