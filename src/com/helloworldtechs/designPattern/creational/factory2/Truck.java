package com.helloworldtechs.designPattern.creational.factory2;

public class Truck implements Vehicle{

    Truck() {
        /*
        Constructor is protected , clients need to use the factory method
        */
    }

    @Override
    public void design() {
        System.out.println(" Designing Truck");
    }

    @Override
    public void manufacture() {
        System.out.println(" Manufacturing Truck");

    }
}
