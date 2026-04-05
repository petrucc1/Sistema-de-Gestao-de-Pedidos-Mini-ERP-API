package dev.sarahpetrucci.SistemaDeGestaoDePedidos.controller;

import dev.sarahpetrucci.SistemaDeGestaoDePedidos.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // CREATE

    // READ

    // UPDATE - PATCH

    // DELETE
}
