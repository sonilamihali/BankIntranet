package com.sonila.BankIntranet.Models;

public class User {
    private String name;
    private String username;
    private Integer age;
    private String bank;

    public User(String name,
                String username,
                Integer age, String bank) {
        this.name = name;
        this.username = username;
        this.age = age;
        this.bank = bank;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", bank='" + bank + '\'' +
                '}';
    }
}
