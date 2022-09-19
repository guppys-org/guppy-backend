package org.github.guppy.backend.controller;

import org.github.guppy.backend.controller.jsonapi.CollectionResponse;
import org.github.guppy.backend.models.Product;
import org.github.guppy.backend.services.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @Mock
    ProductService productService;

    @InjectMocks
    private ProductController controller;

    @Test
    public void textExampleController(){
        //Given
        List<Product> serviceResult = new ArrayList<>();
        serviceResult.add(new Product());
        when(productService.getProducts()).thenReturn(serviceResult);

        //When
        ResponseEntity<CollectionResponse<Product>> responseEntity = controller.getProducts();

        //Then
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
        assertThat(responseEntity.getBody().getData()).isEqualTo(serviceResult);
    }
}
