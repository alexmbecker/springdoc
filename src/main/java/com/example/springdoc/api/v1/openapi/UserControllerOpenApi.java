package com.example.springdoc.api.v1.openapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User")
public interface UserControllerOpenApi {

    @Operation(summary = "Get hello user")
    String hello();

    @Operation(summary = "Get bye user")
    String bye();

}
