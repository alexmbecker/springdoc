package com.example.springdoc.api.v1.openapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Admin")
public interface AdminControllerOpenApi {

    @Operation(summary = "Get hello admin")
    String hello();

}
