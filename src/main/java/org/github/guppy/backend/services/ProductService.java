package org.github.guppy.backend.services;


import org.github.guppy.backend.models.Product;
import org.github.guppy.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(@Autowired ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(UUID businessId){
        return productRepository.getByBusinessId(businessId);
    }

}
