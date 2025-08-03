package com.saket.cloning;

public class Human implements Cloneable{

    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,7,8,};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

//@Override
//    public Object clone() throws CloneNotSupportedException {
//        // this is Shallow Copy
//        return super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // this is deep Copy
        Human twin = (Human)super.clone(); // this is actually Shallow Copy

        // make a deep copy
        //Human twin = null;

        twin.arr = new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

