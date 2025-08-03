package com.saket.interfaces.extandDemo2;

public class Main implements B, A {
//    @Override
//    public void fun() {
//
//    }
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }

}
