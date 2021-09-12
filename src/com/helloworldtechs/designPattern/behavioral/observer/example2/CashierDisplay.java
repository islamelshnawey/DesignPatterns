package com.helloworldtechs.designPattern.behavioral.observer.example2;

public class CashierDisplay extends Observer {

    public void update(String str) {
        System.out.print("[CashierDisplay] " + str);
    }
}
