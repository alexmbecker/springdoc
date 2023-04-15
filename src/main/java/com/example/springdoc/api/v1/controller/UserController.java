package com.example.springdoc.api.v1.controller;

import com.example.springdoc.api.v1.openapi.UserControllerOpenApi;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController implements UserControllerOpenApi {

    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 ok"))
    @GetMapping("/hello")
    public String hello() {
        return "Hello User!!!";
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "status 200 ok"),
            @ApiResponse(responseCode = "201", description = "status 201 ok")
    })
    @GetMapping("/bye")
    public String bye() {
        return "Bye User!!!";
    }
}
