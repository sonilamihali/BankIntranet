package com.sonila.BankIntranet.Repository;

import com.sonila.BankIntranet.Models.Transaction;

import java.util.List;

public interface TransactionRepository {
    void save (Transaction transaction);
    List<Transaction> findTransactionByUsername(String username);
    void update (Transaction transaction);
    List<Transaction> findAll();

}
