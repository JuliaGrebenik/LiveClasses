package org.example.class9;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private double weight;

    Dog(String name,String breed, int age ){
           this.name = name;
           this.breed = breed;
           this.age = age;

    }
    Dog(String name, String breed, int age, double weight) {
        /*this.name = name;
        this.breed = breed;
        this.age = age;*/
        this(name,breed,age);
        this.weight = weight;
    }
    void bark() {
        System.out.println("Wuff Wufff...");
    }
    void sleep(){
        System.out.println("ZzzzzZzzzz...");
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+age+" "+weight);
    }
    void price(){
        if(age<1){
            System.out.println("price is 200");
        }else{
            System.out.println("500");
        }
    }
}
