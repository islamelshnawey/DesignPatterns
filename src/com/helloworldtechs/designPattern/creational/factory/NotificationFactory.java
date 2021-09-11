package com.helloworldtechs.designPattern.creational.factory;

/**
 * Create a factory class NotificationFactory.java to instantiate concrete class.
 **/
public class NotificationFactory {

    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }
        if("SMS".equals(channel)){
            return new SMSNotification();
        }
        if("EMAIL".equals(channel)){
            return new EmailNotification();
        }
        if("PUSH".equals(channel)){
            return new PushNotification();
        }
        return null;
    }
}
