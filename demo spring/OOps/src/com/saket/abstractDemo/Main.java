package com.saket.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.normal();

        Parent dau = new Son(27);
        dau .career();
        Parent.hello();
        //Parent p = new Parent();

    }
}
