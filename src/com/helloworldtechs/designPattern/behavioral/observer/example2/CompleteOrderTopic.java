package com.helloworldtechs.designPattern.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {

    List<Observer> orderCompletedObservers = new ArrayList<Observer>();

    public void notifyObservers(String line) {
        for(Observer observer : orderCompletedObservers) {
            observer.update(line);
        }
    }

    public void register(Observer o) {
        orderCompletedObservers.add(o);
    }
}
