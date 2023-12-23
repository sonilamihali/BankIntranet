package com.sonila.BankIntranet.Models;

public class Account {

    private User name;
    private Double balance;

    private String iban;

    public Account() {
    }

    public Account(User name,
                   Double balance,
                   String iban) {
        this.name = name;
        this.balance = balance;
        this.iban = iban;
    }

    public User getName() {
        return name;
    }

    public void setName(User name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name=" + name +
                ", balance=" + balance +
                ", iban='" + iban + '\'' +
                '}';
    }
}
