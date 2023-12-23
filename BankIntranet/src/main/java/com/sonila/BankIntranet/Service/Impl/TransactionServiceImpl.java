package com.sonila.BankIntranet.Service.Impl;

import com.sonila.BankIntranet.Models.Transaction;
import com.sonila.BankIntranet.Repository.TransactionRepository;
import com.sonila.BankIntranet.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public void save(Transaction transaction) {
        if (transaction.getUsername()==null || transaction.getQuantity()==null ||
                transaction.getIban()==null || transaction.getDate()==null){
            throw new RuntimeException("Empty fields, can not save transaction!");
        }
        transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findTransactionByUsername(String username) {
        return transactionRepository.findTransactionByUsername(username);
    }
    @Override
    public void update(Transaction transaction) {
        if (transaction.getUsername()==null || transaction.getQuantity()==null ||
                transaction.getIban()==null || transaction.getDate()==null){
            throw new RuntimeException("Empty fields, can not save transaction!");
        }
        transactionRepository.update(transaction);
    }

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }
}
