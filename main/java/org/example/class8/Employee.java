package org.example.class8;

public class Employee {

    public static String companyName="Google";
    String name;
    int age;
    int salary;


    void getSalary(double bonus){
        double finalSalary=salary*bonus;
        System.out.println(finalSalary);

    }
}
