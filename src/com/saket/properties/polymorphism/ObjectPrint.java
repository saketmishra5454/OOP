package com.saket.properties.polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(10);

        System.out.println(obj);
    }

}
