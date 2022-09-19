package org.github.guppy.backend.controller;

import org.github.guppy.backend.controller.jsonapi.CollectionResponse;
import org.github.guppy.backend.models.Product;
import org.github.guppy.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(@Autowired ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/v1/products")
    public ResponseEntity<CollectionResponse<Product>> getProducts() {
        return ResponseEntity.ok(CollectionResponse.of(productService.getProducts()));
    }
}
