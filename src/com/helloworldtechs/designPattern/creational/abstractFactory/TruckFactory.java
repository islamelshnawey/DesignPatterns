package com.helloworldtechs.designPattern.creational.abstractFactory;

public class TruckFactory extends Factory {
    @Override
    public Engine getEngine() {
        return new TruckEngine();
    }

    @Override
    public Tyre getTyre() {
        return new TruckTyre();
    }
}
