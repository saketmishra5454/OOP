package com.saket.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student saket = new Student(38,89.76f);
        Student mukund = new Student(5,99.52f);
        Student jyoti = new Student(43,95.52f);
        Student swati = new Student(23,77.52f);
        Student arpit = new Student(1,96.52f);
        Student krishna = new Student(54,91.52f);

        Student[] list = {saket, mukund, jyoti, swati, arpit, krishna};
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return  -(int)(o1.marks - o2.marks);
//            }
//        });
        Arrays.sort(list,(o1,o2) -> -(int)(o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));

//        if (saket.compareTo(mukund)<0){
//            System.out.println(saket.compareTo(mukund));
//            System.out.println("Mukund has more marks");
//
//        }
    }
}
