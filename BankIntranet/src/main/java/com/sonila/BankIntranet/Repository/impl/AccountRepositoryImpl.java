package com.sonila.BankIntranet.Repository.impl;

import com.sonila.BankIntranet.Models.Account;
import com.sonila.BankIntranet.Repository.AccountRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AccountRepositoryImpl implements AccountRepository {
    private static final List<Account> accounts = new ArrayList<>();

    @Override
    public void save(Account account) {
        accounts.add(account);
    }

    @Override
    public List<Account> findByName(String username) {
        return accounts.stream().filter(account -> account.getName()
                .getUsername().equals(username)).toList();
    }

    @Override
    public void update(Account account) {
        int index = -1;
        for (Account a : accounts){
            if(a.getName().equals(account.getName())){
                index= accounts.indexOf(a);
            }
        } if (index != -1){
            accounts.remove(index);
            accounts.add(account);
        }

    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }
}
