package org.github.guppy.backend.controller.jsonapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/***
 * Class for implementing JSONAPI <a href="https://jsonapi.org/format/#document-structure">spec</a> Collection Responses
 * @param <T> the body type
 */
public class CollectionResponse<T> {
    @JsonProperty("data")
    private final List<T> data;

    public CollectionResponse(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public static <R> CollectionResponse<R> of(List<R> data) {
        return new CollectionResponse<>(data);
    }
}
