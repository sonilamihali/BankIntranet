package com.sonila.BankIntranet.Controller;

import com.sonila.BankIntranet.Models.User;
import com.sonila.BankIntranet.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void save(@RequestBody User user) {

        userService.save(user);
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable("username") String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/all")
    public List<User> findAll(){

        return userService.findAll();
    }

    @PutMapping("/{username}")
    public void update(@RequestBody User user,@PathVariable("username") String username){

        userService.update(user);
    }
}

