package org.github.guppy.backend.services;


import org.github.guppy.backend.models.Product;
import org.github.guppy.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    ProductRepository productRepository;

    public ProductService(@Autowired ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> GetProducts(){
        List<Product> list_of_products = new ArrayList<>();
        Iterable<Product> values = productRepository.findAll();
        values.forEach(value -> list_of_products.add(value));
        return list_of_products;
    }
}
