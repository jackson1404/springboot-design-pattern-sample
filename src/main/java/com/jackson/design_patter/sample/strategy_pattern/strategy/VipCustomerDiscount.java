package com.jackson.design_patter.sample.strategy_pattern.strategy;

import org.springframework.stereotype.Component;

@Component("VIP_CUSTOMER")
public class VipCustomerDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount(Double amount) {
        return amount * 0.8;
    }
}
