package com.jackson.design_patter.sample.factory_pattern.sender;

import org.springframework.stereotype.Service;

@Service
public interface NotificationSender {

    void send(String to, String message);
}
