package com.saket.interfaces.extandDemo2;

public interface A {
    //static interface methods should always have a body
    //call via the interface name
    default void fun(){
        System.out.println("I in A");
    }

    static void greeting(){
        System.out.println("Hey I am static method");
    }
}
