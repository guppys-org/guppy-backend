package org.github.guppy.backend.controller;

import org.github.guppy.backend.controller.jsonapi.CollectionResponse;
import org.github.guppy.backend.models.Business;
import org.github.guppy.backend.services.BusinessService;
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
public class BusinessControllerTest {

    @Mock
    BusinessService businessService;

    @InjectMocks
    private BusinessController controller;

    @Test
    public void getBusinessTest_retrievedBusiness(){
        //Given
        List<Business> serviceResult = new ArrayList<>();
        serviceResult.add(new Business());
        when(businessService.getBusiness()).thenReturn(serviceResult);

        //When
        ResponseEntity<CollectionResponse<Business>> responseEntity = controller.getBusiness();

        //Then
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
        assertThat(responseEntity.getBody().getData()).isEqualTo(serviceResult);
    }
}
