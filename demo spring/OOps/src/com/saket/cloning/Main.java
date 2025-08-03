package com.saket.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human saket = new Human(22,"Saket Mishra");
       // Human twin = new Human(saket);

        Human twin = (Human)saket.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] =100;

        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(saket.arr));
    }
}
