package com.saket.introduction;
public class WrappersExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 45;

        swap(a, b);

        System.out.println(a+ " " + b);
//        final int bonus = 2;
//        bonus = 3;
        final A saket = new A("Saket Mishra");
        saket.name = "other name";

        // when a non primitive is final, you cannot reassign it.
        // saket = new A("new object");

          A obj = new A("Rnasudbuf") ;

        System.out.println(obj);
//        for(int i = 0; i<1000000000; i++){
//            obj = new A("Random name");
//        }
    }
    //static void swap(int a, int b){
    static void swap(Integer a, Integer b){  // Integer class is also a final CLass thats why
        // it can not swap the value
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

   // @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}