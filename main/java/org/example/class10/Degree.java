package org.example.class10;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree{

}

class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("You need a highschool diploma");

    }
}
