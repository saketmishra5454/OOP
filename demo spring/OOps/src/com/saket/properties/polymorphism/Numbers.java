package com.saket.properties.polymorphism;

public  class Numbers {
    void sum(double a, double b){
        System.out.println(a+b);
    }
    double sum(double a, double b, double c){
        return a+b+c;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
      //  numbers.sum(1, 2, 3);
        System.out.println(numbers.sum(1, 2, 3));

        numbers.sum(3, 4);
        numbers.sum(5, 6, 7, 8);
    }
}
