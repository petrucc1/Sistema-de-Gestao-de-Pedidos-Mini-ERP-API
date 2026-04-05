package dev.sarahpetrucci.SistemaDeGestaoDePedidos.service;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.mapper.ProductMapper;
import dev.sarahpetrucci.SistemaDeGestaoDePedidos.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    // CREATE

    // READ

    // UPDATE - PATCH

    // DELETE
}
