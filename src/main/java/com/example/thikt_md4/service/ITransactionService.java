package com.example.thikt_md4.service;

import com.example.thikt_md4.model.Transaction;

import java.util.List;

public interface ITransactionService {
    List<Transaction> getAllTransactions();

    Transaction getTransactionById(Long transactionId);

    void saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);
}
