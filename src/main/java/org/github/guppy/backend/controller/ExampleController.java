package org.github.guppy.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Greetings from Spring Boot!");
    }

}

