package org.github.guppy.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/v1/products")
    public ResponseEntity<String> getProducts() {
        return ResponseEntity.ok("Here you have your products. What where you expecting, unicorns?");
    }
}
