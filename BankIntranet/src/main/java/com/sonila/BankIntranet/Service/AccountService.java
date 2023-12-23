package com.sonila.BankIntranet.Service;

import com.sonila.BankIntranet.Models.Account;

import java.util.List;

public interface AccountService {
    void save (Account account);
    List<Account> findByName(String accountName);

    void update(Account account);
    List<Account> findAll();
}
