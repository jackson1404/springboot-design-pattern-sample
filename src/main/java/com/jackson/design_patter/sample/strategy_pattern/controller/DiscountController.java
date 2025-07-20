package com.jackson.design_patter.sample.strategy_pattern.controller;

import com.jackson.design_patter.sample.strategy_pattern.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discount")
@RequiredArgsConstructor
public class DiscountController {

    private final DiscountService discountService;

    @GetMapping
    public ResponseEntity<Double> getDiscount(@RequestParam("type") String type, @RequestParam("amount") double amount){
        return ResponseEntity.ok(discountService.calculateDiscount(type, amount));
    }


}
