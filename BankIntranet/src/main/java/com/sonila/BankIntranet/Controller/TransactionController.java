package com.sonila.BankIntranet.Controller;

import com.sonila.BankIntranet.Models.Transaction;
import com.sonila.BankIntranet.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping // /user
    public void save(@RequestBody Transaction transaction) {

        transactionService.save(transaction);
    }

    @GetMapping("/{username}")
    public Transaction findByUsername(@PathVariable("username") String username) {
        return (Transaction) transactionService.findTransactionByUsername(username);
    }

    @GetMapping("/all")
    public List<Transaction> findAll(){

        return transactionService.findAll();
    }

    @PutMapping("/{username}")
    public void update(@RequestBody Transaction transaction,@PathVariable("username") String username){
        transactionService.update(transaction);
    }
}

