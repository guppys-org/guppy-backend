package org.github.guppy.backend.controller.jsonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class CollectionResponseTest {

    @Test
    public void textExampleController() throws JsonProcessingException {
        // Given
        List<String> body = new ArrayList<>();
        body.add("Element 1");
        body.add("Element 2");

        // When
        CollectionResponse<String> collectionResponse = CollectionResponse.of(body);

        // Then
        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(collectionResponse);
        assertThat(json).isEqualTo("{\"data\":[\"Element 1\",\"Element 2\"]}");
    }

}