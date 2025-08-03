package com.saket.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;



    }

    //we will go in details into HashMap lec;
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 54.6F);
        ObjectDemo obj2 = new ObjectDemo(34, 87.4F);


        if(obj == obj2){
            System.out.println("obj is less than obj2");

        }
        if(obj.equals(obj2)){
            System.out.println("obj's num is less than obj2's num");
        }
        System.out.println(obj.getClass().getName());

       //System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}
