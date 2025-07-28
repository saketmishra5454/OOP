package com.saket.properties.inheritance;

public class Box {

    private double l;
    double h;
    double w;
    //double weight = 4.3 ;

  //  @Override
    static void greeting(){
        System.out.println("Hey, I am in Box class. Greetings!!");
    }


    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;

    }
    //cube
    Box(double side){
        this.h = side;
        this.w = side;
        this.l = side;

    }
    Box(double l, double h, double w){
        System.out.println("Box class constructor");
        this.h = h;
        this.w = w;
        this.l = l;

    }
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;

    }




    public void information(){
        System.out.println("Running the Box");
    }


    public static class BoxColour extends BoxWeight {

    }
}
