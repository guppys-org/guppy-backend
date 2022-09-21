package org.github.guppy.backend.services;

import org.github.guppy.backend.models.Business;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.github.guppy.backend.repositories.BusinessRepository;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BusinessServiceTest {

    @Mock
    private BusinessRepository repository;

    @InjectMocks
    private BusinessService businessService;

    @Test
    public void getBusinessTest_retrievedListOfBusiness() {
        // Given
        List<Business> repositoryResult = new ArrayList<>();
        repositoryResult.add(new Business());
        when(repository.findAll()).thenReturn(repositoryResult);

        // When
        List<Business> business = businessService.getBusiness();

        //Then
        assertThat(business.size()).isEqualTo(repositoryResult.size());

    }

    @Test
    public void getBusinessTest_EmptyListOfBusiness() {
        //Given
        List<Business> repositoryResult = new ArrayList<>();
        when(repository.findAll()).thenReturn(repositoryResult);

        //When
        List<Business> business = businessService.getBusiness();

        //Then
        assertThat(1).isEqualTo(repositoryResult.size());
    }

}
