package com.sonila.BankIntranet.Repository.impl;

import com.sonila.BankIntranet.Models.User;
import com.sonila.BankIntranet.Repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserRepositoryImpl implements UserRepository {
    private static final List<User> users = new ArrayList<>();
    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername()
                .equals(username))
                .findFirst().orElse(null);
    }

    @Override
    public void update(User user) {
        int index = -1;
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                index = users.indexOf(u);
            }
        }
        if (index != -1) {
            users.remove(index);
            users.add(user);
        } else {
            throw new RuntimeException("User does not exist");
        }
    }
    @Override
    public List<User> findAll() {
        return users;
    }
}
