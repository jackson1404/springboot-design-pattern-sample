package com.jackson.design_patter.sample.factory_pattern.sender;

import org.springframework.stereotype.Component;

@Component("SMS")
public class SmsNotificationSender implements NotificationSender{
    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);

    }
}
