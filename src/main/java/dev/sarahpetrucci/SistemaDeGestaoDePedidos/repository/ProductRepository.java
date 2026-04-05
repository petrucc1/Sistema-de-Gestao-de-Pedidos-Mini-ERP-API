package dev.sarahpetrucci.SistemaDeGestaoDePedidos.repository;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
