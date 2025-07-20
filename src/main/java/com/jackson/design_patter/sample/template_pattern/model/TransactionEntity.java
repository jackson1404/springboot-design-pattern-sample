package com.jackson.design_patter.sample.template_pattern.model;

import com.jackson.design_patter.sample.template_pattern.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEntity {

    private String id;
    private String sourceAccountId;
    private String targetAccountId;
    private double amount;
    private TransactionType type;


}
