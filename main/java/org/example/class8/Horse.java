package org.example.class8;

public class Horse {

    String name;
    int age;
    String breed;

    void printName() {
        System.out.println(name);
    }

    void printAge() {
        System.out.println(age);
    }

    void printBreed() {
        System.out.println(breed);
    }



            public static void main(String[] args) {
                Horse h = new Horse();
                h.name = "ted";
                h.age = 15;
                h.breed = "british";

                h.printName();
                h.printAge();
                h.printBreed();
            }

        }






