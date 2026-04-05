package dev.sarahpetrucci.SistemaDeGestaoDePedidos.repository;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}