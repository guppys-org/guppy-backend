package org.github.guppy.backend.repositories;

import org.github.guppy.backend.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository repo;

    @Test
    public void saveProductTest() {
        // Given
        String name = "Product Name 1";
        Product product = new Product();
        product.setName(name);

        // When
        repo.save(product);

        // Then
        Optional<Product> foundProduct = repo.findById(product.getId());
        Product savedProduct = foundProduct.get();
        assertThat(savedProduct.getName()).isEqualTo(name);
    }

}
