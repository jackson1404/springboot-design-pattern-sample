package com.jackson.design_patter.sample.template_pattern.template;

import com.jackson.design_patter.sample.template_pattern.model.TransactionEntity;
import com.jackson.design_patter.sample.template_pattern.model.TransactionResult;
import org.springframework.stereotype.Component;

@Component
public class WithdrawalTransactionProcessor extends TransactionProcessorTemplate{

    @Override
    protected void checkBalance(TransactionEntity transactionEntity) {
        System.out.println("Checking balance for withdrawal transaction " +
                transactionEntity.getSourceAccountId());
    }

    @Override
    protected TransactionResult executeTransaction(TransactionEntity transactionEntity) {
        System.out.println("Processing withdrawal from account: " +
                transactionEntity.getSourceAccountId() +
                " amount: " + transactionEntity.getAmount());

        TransactionResult result = new TransactionResult();
        result.setSuccess(true);
        result.setMessage("Withdrawal completed successfully");
        return result;
    }

    @Override
    protected void notifyParties(TransactionEntity transaction, TransactionResult result) {
        super.notifyParties(transaction, result);
        System.out.println("Sending withdrawal alert to account holder");
    }
}
