package ru.skyeng.domain;

import ru.skyeng.util.GenerationDataUtil;

public class User {
    private String name;
    private String phoneNumber;
    private String email;

    public User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String phoneNumber, String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public User() {
        this.name = GenerationDataUtil.generateName();
        this.phoneNumber = GenerationDataUtil.generateRussiaMobilePhone();
        this.email = GenerationDataUtil.generateEmail();
    }
}
