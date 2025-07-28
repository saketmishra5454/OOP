package com.saket.singleton;

import com.saket.access.A;

import java.util.ArrayList;
import java.util.Collections;

public class SubClass extends A {
    public SubClass(int num, String name){

        super(num,name);

    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10,"Saket");
        int n = obj.num;

        System.out.println(n);

    }
}


class SubSubClass extends SubClass {
    public SubSubClass(int num, String name){

        super(num,name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(10,"Saket");
        int n = obj.num;

        System.out.println(n);

    }
}




class SubClass2 extends A {
    public SubClass2(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10,"Saket");
//        int n = obj.num;
//
//        System.out.println(n);

    }
}

