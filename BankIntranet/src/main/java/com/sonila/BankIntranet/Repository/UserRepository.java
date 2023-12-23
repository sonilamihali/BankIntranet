package com.sonila.BankIntranet.Repository;

import com.sonila.BankIntranet.Models.User;

import java.util.List;

public interface UserRepository {
    void save (User user);
    User findByUsername (String username);
    void update (User user);
    List<User> findAll();
}
