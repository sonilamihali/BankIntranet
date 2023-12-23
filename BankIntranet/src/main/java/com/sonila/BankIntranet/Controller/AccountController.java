package com.sonila.BankIntranet.Controller;

import com.sonila.BankIntranet.Models.Account;
import com.sonila.BankIntranet.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping // /user
    public void save(@RequestBody Account account) {
        accountService.save(account);
    }

    @GetMapping("/{username}")
    public List<Account> findByName(@PathVariable("username") String username) {
        return accountService.findByName(username);
    }

    @GetMapping("/all")
    public List<Account> findAll(){

        return accountService.findAll();
    }

    @PutMapping("/{username}")
    public void update(@RequestBody Account account,@PathVariable("username") String username){
        accountService.update(account);
    }
}

