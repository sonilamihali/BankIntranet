package com.sonila.BankIntranet.Repository;

import com.sonila.BankIntranet.Models.Account;

import java.util.List;

public interface AccountRepository {
    void save (Account account);
    List<Account> findByName(String username);
    void update (Account account);
    List<Account> findAll();

}
