package com.saket.interfaces.extendDemo;

public class Hello implements B,A{
    @Override
    public void fun() {
        System.out.println("Hello");
    }
    @Override
    public void greet() {
        System.out.println("Greeting");
    }

}
