package dev.sarahpetrucci.SistemaDeGestaoDePedidos.mapper;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.domain.Product;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductDTO dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setStockQuantity(dto.getStockQuantity());
        product.setActive(dto.isActive());
        product.setCreatedAt(dto.getCreatedAt());
        return product;
    }

    public ProductDTO toDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setDescription(product.getDescription());
        dto.setStockQuantity(product.getStockQuantity());
        dto.setActive(product.isActive());
        dto.setCreatedAt(product.getCreatedAt());
        return dto;
    }
}