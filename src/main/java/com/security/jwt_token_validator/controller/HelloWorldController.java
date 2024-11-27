package com.security.jwt_token_validator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/home")
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok("Hello world!");
    }
}
