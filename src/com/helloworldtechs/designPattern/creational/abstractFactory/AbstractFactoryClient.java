package com.helloworldtechs.designPattern.creational.abstractFactory;

import java.util.Scanner;

public class AbstractFactoryClient {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        /* Get the factory instance */
        Factory factory;
        try {
            factory = Factory.getFactory(vehicleType);

            /* Get the Engine from the factory */
            Engine engine = factory.getEngine();
            engine.design();
            engine.manufacture();
            engine.test();

            /* Get the Tyre from the factory */
            Tyre tyre = factory.getTyre();
            tyre.design();
            tyre.manufacture();

        } catch (UnknownVehicleException e) {
            System.out.println("Invalid vehicle type entered!");
        }

        in.close();
    }
}