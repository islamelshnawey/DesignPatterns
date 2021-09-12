package com.helloworldtechs.designPattern.behavioral.observer.example1;

/*
 * Observer pattern is used when there is one-to-many relationship
 * between objects such as if one object is modified,
 * its depenedent objects are to be notified automatically.
 * Observer pattern falls under behavioral pattern category.*/
public class ObserverClient {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
