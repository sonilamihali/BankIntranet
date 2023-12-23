package com.sonila.BankIntranet.DTO;

import java.time.LocalDate;

public class TransactionDto {
    private Integer id;
    private Integer amount;
    private LocalDate date;
    private String type;
    private AccountDto accountDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AccountDto getAccountDto() {
        return accountDto;
    }

    public void setAccountDTO(AccountDto accountDto) {
        this.accountDto = accountDto;
    }
}


