package com.jackson.design_patter.sample.template_pattern.controller;

import com.jackson.design_patter.sample.template_pattern.model.TransactionEntity;
import com.jackson.design_patter.sample.template_pattern.model.TransactionResult;
import com.jackson.design_patter.sample.template_pattern.service.TransactionProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionProcessingService transactionProcessingService;

    @PostMapping("/transactions")
    public ResponseEntity<TransactionResult> processTransactions(@RequestBody TransactionEntity transactionEntity) throws IllegalAccessException {
        return ResponseEntity.ok(transactionProcessingService.processTransaction(transactionEntity));
    }


}

