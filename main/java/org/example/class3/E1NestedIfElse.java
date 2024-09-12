package org.example.class3;

public class E1NestedIfElse {

    public static void main(String[] args) {

        boolean mainDoor = true;
        boolean room1 = true;
        int age=20;
        //Ctrl+Alt+l
        if (mainDoor) {

            if (room1) {
                System.out.println("Room 1 is open");
            } else {
                System.out.println("Room 1 is closed");
            }
        } else {
            System.out.println("Main door is closed");
        }
    }
}

