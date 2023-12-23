package com.sonila.BankIntranet.Service.Impl;

import com.sonila.BankIntranet.Models.Account;
import com.sonila.BankIntranet.Repository.AccountRepository;
import com.sonila.BankIntranet.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public void save(Account account) {
        if (account.getName()==null
                || account.getIban()==null
                ||account.getBalance()==null){
            throw new RuntimeException
                    ("Empty fields, can not create account");
        }

        accountRepository.save(account);
    }

    @Override
    public List<Account> findByName(String accountName) {
        return accountRepository.findByName(accountName);
    }

    @Override
    public void update(Account account) {
        if (account.getName()==null || account.getIban()==null ||account.getBalance()==null){
            throw new RuntimeException("Empty fields, can not update account");
        }

        accountRepository.update(account);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
