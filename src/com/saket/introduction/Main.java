package com.saket.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll noo.
        int [] numbers = new int [5];

        //store 5 names
        String[] names = new  String[5];

        // data of 5 students :{roll no., name, marks}
        int[] rno = new int[5];
        String [] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // Student[] students2 = new Student[5];

       // just declaring;
       // Student saket;
    //    saket = new Student();

        Student saket = new Student(18,"Saket Mishra", 80.4f );

        //Student saket = new Student();
        Student saker = new Student();

//        saket.changeName("saku");
//        saket.greeting();

//        saket.rno = 58;
//        saket.name = "Saket Mishra";
//        saket.marks = 78.52f;

//        System.out.println(saket.rno);
//        System.out.println(saket.name);
//        System.out.println(saket.marks);

        Student random = new Student(saket);
        System.out.println(random.name);

        Student random1 = new Student();
        System.out.println(random1.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something Something";
       // System.out.println(two.name == one.name);
        System.out.println(two.name);



    }


    // create a class
    // for every single student
    static class Student{
        int rno;
//        saket.rno = 58;
//        saket.name = "Saket Mishra";
//        saket.marks = 78.52f;
        String name;
        float marks = 90;

        // we need a way to add the values of the above
        // properties object-by-object

        // we need one word to access every object



        void greeting(){
            System.out.println("Hello! My name is " + this.name);
        }
        void changeName(String newName){
            name = newName;
        }

        Student (Student other){
            this.name = other.name;
            this.marks = other.marks;
        }
        Student(){
            // this is how we call a constructor from another constructor
            // internally: new Student(13, "default person", 100.0f);
            this(13, "default person", 100.0f);
        }

//        Student(){
//            this.rno = 58;
//            this.name = "Saket Mishra";
//            this.marks = 78.52f;
//        }

        //Student Abhishek = new Student(17, "Abhishek", 91.2f);
        // here, this will be replaced with Abhishek
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }
}
