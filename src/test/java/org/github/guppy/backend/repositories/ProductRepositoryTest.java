package org.github.guppy.backend.repositories;

import org.github.guppy.backend.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository repo;

    @Test
    public void saveProductTest(){
        repo.save(new Product());
    }

}
