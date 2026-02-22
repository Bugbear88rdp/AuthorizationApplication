package ru.netology.netology.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class User {
    @NotNull(message = "User cannot be null")
    @NotEmpty(message = "User name cannot be empty")
    private String user;

    @NotNull(message = "Password cannot be null")
    @NotEmpty(message = "Password cannot be empty")
    private String password;

    public User() {}

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
