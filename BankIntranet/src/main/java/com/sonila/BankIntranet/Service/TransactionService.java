package com.sonila.BankIntranet.Service;

import com.sonila.BankIntranet.Models.Transaction;

import java.util.List;

public interface TransactionService {
    void save (Transaction transaction);
    List<Transaction> findTransactionByUsername(String username);

    void update(Transaction transaction);
    List<Transaction> findAll();
}
