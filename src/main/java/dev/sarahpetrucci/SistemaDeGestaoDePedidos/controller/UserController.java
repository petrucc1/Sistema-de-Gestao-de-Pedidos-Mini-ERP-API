package dev.sarahpetrucci.SistemaDeGestaoDePedidos.controller;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE

    // READ

    // UPDATE - PATCH

    // DELETE
}
