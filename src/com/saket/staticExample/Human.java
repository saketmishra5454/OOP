package com.saket.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    static void message(){
        System.out.println("Hello World");
      //  System.out.println(this.age); // we can not use "this" in the static method
        // becoz obiously this pointing to an object;
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
}
