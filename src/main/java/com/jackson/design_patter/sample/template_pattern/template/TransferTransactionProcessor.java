package com.jackson.design_patter.sample.template_pattern.template;

import com.jackson.design_patter.sample.template_pattern.model.TransactionEntity;
import com.jackson.design_patter.sample.template_pattern.model.TransactionResult;
import org.springframework.stereotype.Component;

@Component
public class TransferTransactionProcessor extends TransactionProcessorTemplate{

    @Override
    protected void checkBalance(TransactionEntity transactionEntity) {
        System.out.println("Checking sufficient balance in source account for transfer: " +
                transactionEntity.getSourceAccountId());

    }

    @Override
    protected TransactionResult executeTransaction(TransactionEntity transactionEntity) {

        System.out.println("Processing transfer from account: " + transactionEntity.getSourceAccountId() +
                        "to " + transactionEntity.getTargetAccountId() +
                        "amount " + transactionEntity.getAmount());

        TransactionResult result = new TransactionResult();
        result.setSuccess(true);
        result.setMessage("Transfer completed successfully");
        return result;
    }

    @Override
    protected void notifyParties(TransactionEntity transactionEntity, TransactionResult result) {
        super.notifyParties(transactionEntity, result);
        System.out.println("Sending specific transfer notifications to both parties");
    }
}
