package com.sonila.BankIntranet.Repository.impl;

import com.sonila.BankIntranet.Models.Transaction;
import com.sonila.BankIntranet.Models.User;
import com.sonila.BankIntranet.Repository.TransactionRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class TransactionRepositoryImpl implements TransactionRepository {
private static final List<Transaction> transactions= new ArrayList<>();

    @Override
    public void save(Transaction transaction) {
     transactions.add(transaction);
    }
    @Override
    public List<Transaction> findTransactionByUsername(String username) {
        return transactions.stream().filter(transaction -> transaction.
                getUsername().equals(username)).toList();
    }

    @Override
    public void update(Transaction transaction) {
        int index = -1;
        for (Transaction t : transactions) {
            if (t.getUsername().equals(transaction.getUsername())) {
                index = transactions.indexOf(t);
            }
        }
        if (index != -1) {
            transactions.remove(index);
            transactions.add(transaction);
        } else {
            throw new RuntimeException("Transaction does not exist");
        }
    }
    @Override
    public List<Transaction> findAll() {
        return transactions;
    }
}
