package com.jackson.design_patter.sample.template_pattern.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TransactionResult {
    private boolean success;
    private String message;

}
