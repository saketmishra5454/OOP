package com.saket.interfaces.nested;

public class A {
    // nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
        //void greet();
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
