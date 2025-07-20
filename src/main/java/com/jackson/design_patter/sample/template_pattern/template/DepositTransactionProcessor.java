package com.jackson.design_patter.sample.template_pattern.template;

import com.jackson.design_patter.sample.template_pattern.model.TransactionEntity;
import com.jackson.design_patter.sample.template_pattern.model.TransactionResult;
import org.springframework.stereotype.Component;

@Component
public class DepositTransactionProcessor extends TransactionProcessorTemplate{

    @Override
    protected void checkBalance(TransactionEntity transactionEntity) {
        System.out.println("Skipping balance check for deposit transaction");
    }

    @Override
    protected TransactionResult executeTransaction(TransactionEntity transactionEntity) {
        System.out.println("Processing deposit to account: " +
                transactionEntity.getTargetAccountId() +
                " amount: " + transactionEntity.getAmount());

        TransactionResult result = new TransactionResult();
        result.setSuccess(true);
        result.setMessage("Deposit completed successfully");
        return result;
    }

    @Override
    protected void notifyParties(TransactionEntity transaction, TransactionResult result) {
        System.out.println("Sending deposit confirmation to account holder only");
    }


}
