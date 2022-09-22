package org.github.guppy.backend.controller;

import org.github.guppy.backend.controller.jsonapi.CollectionResponse;
import org.github.guppy.backend.models.Business;
import org.github.guppy.backend.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    private BusinessService businessService;

    public BusinessController(@Autowired BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("/v1/business")
    public ResponseEntity<CollectionResponse<Business>> getBusiness() {
        return ResponseEntity.ok(CollectionResponse.of(businessService.getBusiness()));
    }
}
