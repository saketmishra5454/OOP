package com.saket.properties.inheritance;


public class Main {
    public static void main(String[] args) {
//       Box box = new Box();
//       System.out.println(box.l +" " +box.w +" "+ box.h);
//
//        Box box1 = new Box(4);
//        System.out.println(box1.l +" " +box1.w +" "+ box1.h);
//
//        Box box2 = new Box(4.6,7.9,9.9);
//        System.out.println(box2.l +" " +box2.w +" "+ box2.h);
//
//        Box box3 = new Box(box1);
//        System.out.println(box.l +" " +box1.w +" "+ box2.h );

//          BoxWeight box4 = new BoxWeight();
//          BoxWeight box5 = new BoxWeight(2,3,4,5);
//        System.out.println("Height "+ box4.h+" " +"Box Weight is "+box4.weight);

//       Box box6 = new BoxWeight(1,2,3,4);
       // System.out.println(box6.w);


        // there are many variables in both parent and child classes
        //  we are given access to variables that are in the ref type i.e. BoxWeight
        // Hence you should have access to weight variable
        // this also means, that the once you are trying to access should be initialized
        // but here, when the obj itself is to type parent class, How will we call the Constructor
        // this is why error;

//        BoxWeight box7 = new Box(1,2,3,4);
//        //System.out.println(box6.w);
//        System.out.println(box7);

       BoxPrice box = new BoxPrice(5,8,200);
//        BoxWeight box2 = new BoxPrice(6,1,340);
//        System.out.println(box.cost);
//        System.out.println(box);
//        System.out.println(box2.weight);

        BoxPrice.greeting(); // You can inherit but you cannot override

        BoxWeight box2 = new BoxWeight();
        box2.greeting();



    }
}
