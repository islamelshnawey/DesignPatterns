package com.helloworldtechs.designPattern.creational.abstractFactory;

public class CarFactory extends Factory {
    @Override
    public Engine getEngine() {
        return new CarEngine();
    }

    @Override
    public Tyre getTyre() {
        return new CarTyre();
    }
}
