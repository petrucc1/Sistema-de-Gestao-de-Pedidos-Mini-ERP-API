package dev.sarahpetrucci.SistemaDeGestaoDePedidos.dto;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.OrderStatus;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    private LocalDateTime dateOrdered;
    private OrderStatus status;
    private BigDecimal total;
}
