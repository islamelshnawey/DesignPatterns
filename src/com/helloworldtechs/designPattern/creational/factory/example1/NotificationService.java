package com.helloworldtechs.designPattern.creational.factory.example1;

/**
 * It is a creational design pattern which talks about the creation of an object.
 * The factory design pattern says that define an interface ( A java interface or an abstract class) and let the subclasses decide which object to instantiate.
 * The factory method in the interface lets a class defer the instantiation to one or more concrete subclasses.
 * Since this design patterns talk about instantiation of an object and so it comes under the category of creational design pattern.
 * If we notice the name Factory method, that means there is a method which is a factory, and in general factories are involved with creational stuff and here with this an object is being created.
 * It is one of the best ways to create an object where object creation logic is hidden to the client.
 * Now Let’s look at the implementation.
 *
 * Now let’s use factory class to create and get an object of concrete class by passing some informatio
 *
 * But the point of the factory pattern is to relieve you from having to know about the individual subclasses and work only with the abstract superclass.
 * The idea is that the factory knows better than you which specific class to instantiate,
 * and you will be better off working only with the methods publishd by the super class.
 * This is often true and a valuable pattern.
 * */
public class NotificationService {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
    }
}
