package ru.netology.netology;

import org.springframework.stereotype.Repository;
import ru.netology.netology.model.Authorities;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("user".equals(user) && "password".equals(password)) {
            return Arrays.asList(Authorities.READ);
        }
        if ("admin".equals(user) && "admin".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE);
          }
        return List.of();
        }
    }
