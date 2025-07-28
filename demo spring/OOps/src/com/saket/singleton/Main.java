package com.saket.singleton;
import com.saket.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

//        Singleton obj1 = Singleton.getInstance();
//
//        Singleton obj2 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object
        A a = new A(10,"Saket");
         a.getNum();
        System.out.println(a.getNum());
        System.out.println(a.getNum());


    }
}
