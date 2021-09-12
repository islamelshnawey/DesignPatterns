package com.helloworldtechs.designPattern.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {

    List<Observer> addPaymentObservers = new ArrayList();

    public void notifyObservers(String line) {
        for(Observer o : addPaymentObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        addPaymentObservers.add(o);
    }
}
