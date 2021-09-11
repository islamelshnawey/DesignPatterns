package com.helloworldtechs.designPattern.creational.abstractFactory;

public class CarEngine implements Engine{
    @Override
    public void design() {
System.out.println("car Engine Design");
    }

    @Override
    public void manufacture() {
        System.out.println("car Engine manufacture");

    }

    @Override
    public void test() {
        System.out.println("car Engine test");

    }
}
