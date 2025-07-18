package com.jackson.design_patter.sample.factory_pattern.factory;

import com.jackson.design_patter.sample.factory_pattern.sender.NotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class NotificationSenderFactory {

    private final Map<String, NotificationSender> notificationSenderMap;

    public NotificationSenderFactory(List<NotificationSender> senderList) {
        this.notificationSenderMap = senderList.stream()
                .collect(Collectors.toMap(s -> s.getClass().getAnnotation(Component.class).value(), Function.identity()));
    }

    public NotificationSender getSender(String type) {
        return Optional.ofNullable(notificationSenderMap.get(type.toUpperCase()))
                .orElseThrow(() -> new IllegalCallerException("Unknown sender type: " + type));
    }


}
