package com.jackson.design_patter.sample.factory_pattern.sender;

import org.springframework.stereotype.Component;

@Component("EMAIL")
public class EmailNotificationSender implements NotificationSender{

    @Override
    public void send(String to, String message) {
        System.out.println("Sending EMAIL to " + to + ": " + message);
    }
}
