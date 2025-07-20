package com.jackson.design_patter.sample.template_pattern.service;

import com.jackson.design_patter.sample.template_pattern.TransactionType;
import com.jackson.design_patter.sample.template_pattern.model.TransactionEntity;
import com.jackson.design_patter.sample.template_pattern.model.TransactionResult;
import com.jackson.design_patter.sample.template_pattern.template.DepositTransactionProcessor;
import com.jackson.design_patter.sample.template_pattern.template.TransactionProcessorTemplate;
import com.jackson.design_patter.sample.template_pattern.template.TransferTransactionProcessor;
import com.jackson.design_patter.sample.template_pattern.template.WithdrawalTransactionProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionProcessingService {

    private final DepositTransactionProcessor depositTransactionProcessor;
    private final TransferTransactionProcessor transferTransactionProcessor;
    private final WithdrawalTransactionProcessor withdrawalTransactionProcessor;

    public TransactionResult processTransaction(TransactionEntity transactionEntity) throws IllegalAccessException {
        TransactionProcessorTemplate processor = getProcessor(transactionEntity.getType());
        return processor.processTransaction(transactionEntity);
    }


    private TransactionProcessorTemplate getProcessor(TransactionType transactionType) throws IllegalAccessException {
        return switch (transactionType){
            case DEPOSIT -> depositTransactionProcessor;
            case WITHDRAWAL -> withdrawalTransactionProcessor;
            case TRANSFER -> transferTransactionProcessor;
            default -> throw new IllegalAccessException("Unknown transaction type " + transactionType);
        };
    }



}
