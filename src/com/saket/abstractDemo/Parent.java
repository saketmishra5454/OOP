package com.saket.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent (int age){
        this.age = age;
        this.VALUE = 1389893;
    }
    static void hello(){
        System.out.println("hello");
    }

    void normal(){
        System.out.println("this is normal");
    }
    abstract void career();
    abstract void partner();


}
