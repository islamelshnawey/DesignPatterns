package com.helloworldtechs.designPattern.behavioral.observer.example2;

public class CustomerDisplay extends Observer {

    public void update(String str) {
        System.out.println("[CustomerDisplay] " + str);
    }
}
