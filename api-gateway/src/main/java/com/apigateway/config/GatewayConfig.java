package com.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

	@Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/api/v1/user")
                        .uri("http://localhost:8081")) // Route requests matching /users/** to http://localhost:8081
                .route("employee-service", r -> r.path("/api/v1/employee/**")
                        .uri("http://localhost:8082")) // Route requests matching /products/** to http://localhost:8082
                .route("orders_route", r -> r.path("/orders/**")
                        .uri("http://localhost:8083")) // Route requests matching /orders/** to http://localhost:8083
                .build();
    }
}
