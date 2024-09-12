package org.example.class6;

public class CatTester {
    public static void main(String[] args) {
        //create the object from the class
         Cat c1=new Cat(); //object
         c1.name="simba";
         c1.age=8;
         c1.breed="persian";
         c1.weight=10;
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.breed);
         //calling a method
         c1.speak();
         c1.sleep();


         Cat c2=new Cat();
         c2.name="Garfield";
         c2.breed="Maih Koon";
         c2.color="Black";
         c2.weight=45;
         c2.eat();
         c2.sleep();



    }


    }


