package com.jackson.design_patter.sample.strategy_pattern.strategy;

import org.springframework.stereotype.Component;

@Component("NEW_CUSTOMER")
public class NewCustomerDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount(Double amount) {
        return amount * 0.9;
    }
}
