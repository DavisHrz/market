package com.davishrz.market.web.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Market", version = "0.1",
        description = "REST API for Market.",
        contact = @Contact(name = "Developer Team", email = "dhernandez@transmodal.com.mx"))
)
public class SwaggerConfig {

}
