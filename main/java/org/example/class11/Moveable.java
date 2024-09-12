package org.example.class11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Moveable {

    String PLANET_NAME="Earth";

    void move();

    }


class Car implements Moveable{
    public void move(){
        System.out.println("Cars can move");
    }

}
class Horse implements Moveable{
    public void move(){
        System.out.println("Cars can move");
    }

}
class MoveableTester{
    public static void main(String[] args) {
        WebDriver webDriver=new ChromeDriver();

    }
}
