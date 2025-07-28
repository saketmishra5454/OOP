package com.saket.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {

        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {

          super(l,h,w); // what is this?? :-> call the parent class Constructor
       // used to initialise values present in parent class
        this.weight = weight;
        //System.out.println(this.weight);

       // System.out.println(super.weight);
    }

}
