package org.github.guppy.backend.repositories;

import org.github.guppy.backend.models.Business;
import org.github.guppy.backend.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class BusinessRepositoryTest {

    @Autowired
    BusinessRepository repo;

    @Test
    public void saveBusinessTest() {
        // Given
        String name = "Business Name 1";
        Business business = new Business();
        business.setName(name);

        // When
        repo.save(business);

        // Then
        Optional<Business> foundProduct = repo.findById(business.getId());
        Business savedBusiness = foundProduct.get();
        assertThat(savedBusiness.getName()).isEqualTo(name);
    }

}
