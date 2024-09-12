package org.example.class10;

public class Parent {
    void marry(){
        System.out.println("Marry the girl");
    }
    void eat(){
        System.out.println("Parents like to eat");
    }
}
class Fahad extends Parent{
     void marry(){
        System.out.println("I want to marry");
    }
}

class FahadTester{
    public static void main(String[] args) {
        Fahad f=new Fahad();
        f.marry();
    }
}
