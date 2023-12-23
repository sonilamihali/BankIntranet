package com.sonila.BankIntranet.Service.Impl;

import com.sonila.BankIntranet.Models.User;
import com.sonila.BankIntranet.Repository.UserRepository;
import com.sonila.BankIntranet.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void save(User user) {
        if (user.getUsername()==null|| user.getUsername().isEmpty()||
                user.getName()==null||user.getName().isEmpty()||user.getBank()==null||
                user.getBank().isEmpty()||user.getAge()==null){
            throw new RuntimeException("Incorrect data user can not be saved!");
        }
        if (findByUsername(user.getUsername()) != null){
            throw new RuntimeException("Can not save user, user already exist!");
        }
        if (user.getAge()<18 || user.getAge()>100){
            throw new RuntimeException("Can not save user, invalid age!");
        }
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void update(User user) {
        if (user.getUsername()==null|| user.getUsername().isEmpty()||
                user.getName()==null||user.getName().isEmpty()||user.getBank()==null||
                user.getBank().isEmpty()||user.getAge()==null){
            throw new RuntimeException("Incorrect data user can not be saved!");
        }
        if (user.getAge()<18 || user.getAge()>100){
            throw new RuntimeException("Can not save user, invalid age!");
        }
        userRepository.update(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
