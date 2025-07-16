package com.jackson.design_patter.sample.factory_pattern.sender;

import org.springframework.stereotype.Component;

@Component("PUSH")
public class PushNotificationSender implements NotificationSender{

    @Override
    public void send(String to, String message) {
        System.out.println("Sending Push Notification to " + to + ": " + message);

    }
}
