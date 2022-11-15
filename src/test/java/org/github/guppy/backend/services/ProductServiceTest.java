package org.github.guppy.backend.services;

import org.github.guppy.backend.models.Product;
import org.github.guppy.backend.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void getProductsTest_retrievedListOfProducts() {
        // Given
        UUID businessId = UUID.randomUUID();
        List<Product> repositoryResult = new ArrayList<>();
        repositoryResult.add(new Product());
        when(repository.getByBusinessId(businessId)).thenReturn(repositoryResult);

        // When
        List<Product> products = productService.getProducts(businessId);

        // Then
        assertThat(products.size()).isEqualTo(repositoryResult.size());
    }

    @Test
    public void getProductsTest_emptyListOfProducts() {
        // Given
        UUID businessId = UUID.randomUUID();
        List<Product> repositoryResult = new ArrayList<>();
        when(repository.getByBusinessId(businessId)).thenReturn(repositoryResult);

        // When
        List<Product> products = productService.getProducts(businessId);

        // Then
        assertThat(products.size()).isEqualTo(repositoryResult.size());
    }

}
