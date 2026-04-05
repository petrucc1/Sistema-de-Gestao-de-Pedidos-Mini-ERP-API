package dev.sarahpetrucci.SistemaDeGestaoDePedidos.service;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.mapper.OrderMapper;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    // CREATE

    // READ

    // UPDATE - PATCH

    // DELETE
}
