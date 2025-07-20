package com.jackson.design_patter.sample.template_pattern.template;

import com.jackson.design_patter.sample.template_pattern.model.TransactionEntity;
import com.jackson.design_patter.sample.template_pattern.model.TransactionResult;
import org.springframework.stereotype.Component;

@Component
public abstract class TransactionProcessorTemplate {

    public final TransactionResult processTransaction(TransactionEntity transactionEntity) throws IllegalAccessException {

        validateTransaction(transactionEntity);

        checkFraud(transactionEntity);

        checkBalance(transactionEntity);
        
        TransactionResult result = executeTransaction(transactionEntity);

        updateAccounts(transactionEntity, result);

        notifyParties(transactionEntity, result);

        logTransaction(transactionEntity, result);

        return result;
    }

    protected void validateTransaction(TransactionEntity transactionEntity) throws IllegalAccessException {
        System.out.println("Validating transaction " + transactionEntity.getId());
        if (transactionEntity.getAmount() <= 0 ){
            throw new IllegalAccessException("Transaction must be positive");
        }
    }

    protected void checkFraud(TransactionEntity transactionEntity) {
        System.out.println("Performing fraud checks for transaction " + transactionEntity.getId());
    }

    protected abstract void checkBalance(TransactionEntity transactionEntity);

    protected abstract TransactionResult executeTransaction(TransactionEntity transactionEntity);

    protected void updateAccounts(TransactionEntity transactionEntity, TransactionResult result) {
        System.out.println("Updating account balances for transaction: " + transactionEntity.getId());
    }

    protected void notifyParties(TransactionEntity transactionEntity, TransactionResult result) {
        System.out.println("Notifying parties about transaction: " + transactionEntity.getId());
    }

    protected void logTransaction(TransactionEntity transactionEntity, TransactionResult result) {
        System.out.println("Logging transaction: " + transactionEntity.getId());

    }

}
