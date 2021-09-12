package com.helloworldtechs.designPattern.creational.factory.example1;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");

    }
}
