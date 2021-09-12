package com.helloworldtechs.designPattern.behavioral.observer.example2;

public interface Topic {
    public void register(Observer obj);
    public void notifyObservers(String line);
}
