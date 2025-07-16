package com.jackson.design_patter.sample.factory_pattern.controller;

import com.jackson.design_patter.sample.factory_pattern.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping("/notify")
    public String notify(@RequestParam String type,
                         @RequestParam String to,
                         @RequestParam String message) {
        service.notify(type, to, message);
        return "Notification sent via " + type;
    }
}
