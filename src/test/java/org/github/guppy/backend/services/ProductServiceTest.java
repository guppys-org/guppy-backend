package org.github.guppy.backend.services;

import org.github.guppy.backend.models.Product;
import org.github.guppy.backend.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;


@SpringBootTest
class ProductServiceTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void getProductsTest_retrievedListOfProducts() {
        // Given
        List<Product> repositoryResult = new ArrayList<>();
        repositoryResult.add(new Product());
        when(repository.findAll()).thenReturn(repositoryResult);

        // When
        List<Product> products = productService.getProducts();

        // Then
        assertThat(products.size()).isEqualTo(repositoryResult.size());
    }

    @Test
    public void getProductsTest_emptyListOfProducts() {
        // Given
        List<Product> repositoryResult = new ArrayList<>();
        when(repository.findAll()).thenReturn(repositoryResult);

        // When
        List<Product> products = productService.getProducts();

        // Then
        assertThat(products.size()).isEqualTo(repositoryResult.size());
    }

}
