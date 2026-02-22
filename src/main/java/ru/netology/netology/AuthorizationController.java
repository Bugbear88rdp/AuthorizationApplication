package ru.netology.netology;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.netology.model.Authorities;
import ru.netology.netology.model.User;
import ru.netology.netology.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    private final AuthorizationService;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/athorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user,
                                            @RequestParam("password") String password) {
        return service.getAuthorities(user, password);

    }
}
