package com.sonila.BankIntranet.Models;

import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;

import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime date;
    private Account iban;
    private Double quantity;
    private User username;
    private String type;

    public Transaction() {
    }

    public Transaction(LocalDateTime date,
                       Account iban, Double quantity,
                       User username,
                       String type) {
        this.date = date;
        this.iban = iban;
        this.quantity = quantity;
        this.username = username;
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Account getIban() {
        return iban;
    }

    public void setIban(Account iban) {
        this.iban = iban;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", iban=" + iban +
                ", quantity=" + quantity +
                ", username=" + username +
                ", type='" + type + '\'' +
                '}';
    }
}
