package org.example.class3;

public class E2NestedIfElse {

    public static void main(String[] args) {

        boolean mainDoor =true;
        boolean room1 = true;
        boolean room2=false;

        //Ctrl+Alt+l
        if (mainDoor) {

            if (room1) {
                System.out.println("Room 1 is open");
            } else {
                System.out.println("Room 1 is closed");
            }
            if(room2){
                System.out.println("Room 2 is open");

            }else{
                System.out.println("Room 2 is closed");
            }


        } else {
            System.out.println("Main door is closed");
        }
    }
}
