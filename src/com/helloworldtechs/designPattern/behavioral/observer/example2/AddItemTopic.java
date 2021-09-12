package com.helloworldtechs.designPattern.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic  implements Topic {

    List<Observer> addItemObservers = new ArrayList();


    public void notifyObservers(String line) {
        for(Observer o : addItemObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        addItemObservers.add(o);
    }

}
