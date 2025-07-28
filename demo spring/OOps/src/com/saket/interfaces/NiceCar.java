package com.saket.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();

    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();

    }
    public void stopMusic(){
        player.stop();
    }
    public void startMusic(){
       player.start();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
