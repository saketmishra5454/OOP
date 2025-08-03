package com.saket.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
       super(age);

    }
    @Override
    void normal() {
        super.normal();

    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor with the age "+ age);


    }
    @Override
    void partner() {
        System.out.println("I love Pepper Potts");

    }


}
