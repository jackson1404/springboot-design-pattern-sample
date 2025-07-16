package com.jackson.design_patter.sample.factory_pattern.service;

import com.jackson.design_patter.sample.factory_pattern.factory.NotificationSenderFactory;
import com.jackson.design_patter.sample.factory_pattern.sender.NotificationSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationSenderFactory factory;

    public NotificationService(NotificationSenderFactory factory) {
        this.factory = factory;
    }

    public void notify(String type, String to, String message) {
        NotificationSender sender = factory.getSender(type);
        if (sender != null) {
            sender.send(to, message);
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }

}
