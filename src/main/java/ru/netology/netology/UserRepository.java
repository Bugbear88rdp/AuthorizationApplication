package ru.netology.netology;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return List.of();
    }
}
