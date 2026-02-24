package ru.netology.netology;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.netology.annotation.AuthorizeUser;
import ru.netology.netology.model.Authorities;
import ru.netology.netology.model.User;
import ru.netology.netology.AuthorizationService;


import java.util.List;

@RestController
public class AuthorizationController {
    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid @AuthorizeUser User user) {
        return service.getAuthorities(user);
    }
}