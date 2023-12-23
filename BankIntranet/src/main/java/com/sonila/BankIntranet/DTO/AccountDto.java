package com.sonila.BankIntranet.DTO;

public class AccountDto {
    private Integer id;
    private String accountName;
    private String iban;
    private Integer balance;
    private String currency;
    private UserDto userDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDTO(UserDto userDto) {
        this.userDto = userDto;
    }
}


