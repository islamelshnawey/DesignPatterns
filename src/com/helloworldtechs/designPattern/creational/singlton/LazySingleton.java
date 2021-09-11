package com.helloworldtechs.designPattern.creational.singlton;

/**
 * Lazy initialization: In this method, object is created only if it is needed. This may prevent resource wastage.
 * An implementation of getInstance() method is required which return the instance.
 * There is a null check that if object is not created then create, otherwise return previously created.
 * To make sure that class cannot be instantiated in any other way, constructor is made final.
 * As object is created with in a method, it ensures that object will not be created until and unless it is required.
 * Instance is kept private so that no one can access it directly.
 * It can be used in a single threaded environment because multiple threads can break singleton property because they can access get instance method simultaneously and create multiple objects.
 */

//Java Code to create singleton class
// With Lazy initialization

public class LazySingleton
{
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static LazySingleton instance;

    private LazySingleton()
    {
        // private constructor
    }

    //method to return instance of class
    public static LazySingleton getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new LazySingleton();
        }
        return instance;
    }
}