package com.example.demogateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("sum-service", r -> r.path("/sum")
                        .uri("http://localhost:8081/sum"))
                .route("minus-service", r -> r.path("/minus")
                        .uri("http://localhost:8082/minus"))
                .build();
    }
}
