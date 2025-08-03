package com.saket.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human saket = new Human(20, "Saket Mishra",900000, false);
//        Human rahul =  new Human(26, "Rahul",65000, true);
//        Human Mukund = new  Human(22, "Mukund Bansal",100000, false);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main obj1 =  new Main();
        obj1.fun2();

    }


    // This is not dependent on objects
    static void fun(){

        //greeting(); // we cant use this because it requires an instance
        // but the function you are using it in does not depend on instances


        // we can not access non-static stuff without referencing their instances in
        // a static context

        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();

    }

    // we know that something which is not static , belongs to an object;
     void greeting(){
        fun(); // that is fine calling static inside non-static
        System.out.println("Hello World");
    }
}
