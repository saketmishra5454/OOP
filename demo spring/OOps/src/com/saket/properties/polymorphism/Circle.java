package com.saket.properties.polymorphism;

public class Circle extends Shapes{


    //this will run when obj of Circle is created
    //hence it is overrinding the parent method
    @Override // this is called annotation
    void area(){

        System.out.println("Area of Circle: "+ "pie *r *r");
    }

}
