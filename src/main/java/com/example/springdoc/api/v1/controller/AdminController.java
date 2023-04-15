package com.example.springdoc.api.v1.controller;

import com.example.springdoc.api.v1.openapi.AdminControllerOpenApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin")
public class AdminController implements AdminControllerOpenApi {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello Admin!!!";
    }
}
