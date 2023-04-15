package com.example.springdoc.core.springdoc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Test API")
                        .version("v1")
                        .description("REST API Test")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org")
                        )
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Link Test")
                        .url("https://test.com"))
                .tags(
                        Arrays.asList(
                                new Tag().name("Admin").description("Admin Messages"),
                                new Tag().name("User").description("User Messages")
                        )
                );
    }
}
