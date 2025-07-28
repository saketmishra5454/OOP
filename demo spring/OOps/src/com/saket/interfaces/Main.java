package com.saket.interfaces;

public class Main {
    public static void main(String[] args) {
        //Engine car = new Car();
//        car.acc();
//        car.start();
//        //car.brake();
//        car.stop();

//        Media carMedia = new Car();
//        carMedia.stop();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();

    }
}
