package ru.netology.netology;

public class UnauthorizedUser extends RuntimeException  {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
