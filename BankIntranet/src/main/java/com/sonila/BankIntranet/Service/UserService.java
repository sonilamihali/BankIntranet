package com.sonila.BankIntranet.Service;

import com.sonila.BankIntranet.Models.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
    void update(User user);
    List<User> findAll();
}
