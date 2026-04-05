package dev.sarahpetrucci.SistemaDeGestaoDePedidos.mapper;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.Order;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.User;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order toEntity(OrderDTO dto) {
        Order order = new Order();
        order.setId(dto.getId());

        if (dto.getUserId() != null) {
            User user = new User();
            user.setId(dto.getUserId());
            order.setUser(user);
        }

        order.setDateOrdered(dto.getDateOrdered());
        order.setStatus(dto.getStatus());
        order.setTotal(dto.getTotal());

        return order;
    }

    public OrderDTO toDTO(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());

        if (order.getUser() != null) {
            dto.setUserId(order.getUser().getId());
        }

        dto.setDateOrdered(order.getDateOrdered());
        dto.setStatus(order.getStatus());
        dto.setTotal(order.getTotal());

        return dto;
    }
}