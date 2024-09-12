package org.example.class10;

public class Father {
    String name="Adam";

}

class Son extends Father{
    String name="Jack";

    void printName(){
        String name="John";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
