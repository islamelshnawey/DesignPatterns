package com.helloworldtechs.designPattern.creational.factory.example2;

public class Motorcycle implements Vehicle {

    Motorcycle() {
        /*
        Constructor is protected , clients need to use the factory method
        */
    }

    @Override
    public void design() {
        System.out.println(" Designing Motorcycle");
    }

    @Override
    public void manufacture() {
        System.out.println(" Manufacturing Motorcycle");

    }
}
