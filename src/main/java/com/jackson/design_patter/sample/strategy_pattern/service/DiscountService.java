package com.jackson.design_patter.sample.strategy_pattern.service;

import com.jackson.design_patter.sample.strategy_pattern.strategy.DiscountStrategy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class DiscountService {

    private final Map<String, DiscountStrategy> strategyMap;

    public DiscountService(List<DiscountStrategy> strategyList){
        this.strategyMap = strategyList.stream()
                .collect(Collectors.toMap(
                        s -> s.getClass().getAnnotation(Component.class).value(),
                        Function.identity()
                ));

    }

    public double calculateDiscount(String type, double amount){
        DiscountStrategy strategy = strategyMap.getOrDefault(type.toUpperCase(), a -> a);
        return strategy.applyDiscount(amount);
    }



}
