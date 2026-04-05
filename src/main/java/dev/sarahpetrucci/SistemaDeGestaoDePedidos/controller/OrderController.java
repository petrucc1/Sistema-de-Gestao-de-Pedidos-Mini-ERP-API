package dev.sarahpetrucci.SistemaDeGestaoDePedidos.controller;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // CREATE

    // READ

    // UPDATE - PATCH

    // DELETE
}
