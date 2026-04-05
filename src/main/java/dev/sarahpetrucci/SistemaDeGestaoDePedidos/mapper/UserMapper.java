package dev.sarahpetrucci.SistemaDeGestaoDePedidos.mapper;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.User;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return user;
    }

    public UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        return dto;
    }
}