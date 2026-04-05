package dev.sarahpetrucci.SistemaDeGestaoDePedidos.service;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.mapper.UserMapper;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    // CREATE

    // READ

    // UPDATE - PATCH

    // DELETE
}
