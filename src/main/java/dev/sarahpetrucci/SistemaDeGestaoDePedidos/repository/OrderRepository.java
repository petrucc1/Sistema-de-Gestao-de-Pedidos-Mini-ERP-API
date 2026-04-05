    package dev.sarahpetrucci.SistemaDeGestaoDePedidos.repository;

    import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.Order;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderRepository extends JpaRepository<Order, Long> {
    }
