package com.apigateway.config;



import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.netty.http.client.HttpClient;

import io.netty.resolver.DefaultAddressResolverGroup;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

	@Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/api/v1/user")
                        .uri("http://localhost:9090")) // Route requests matching /users/** to http://localhost:8081
                .route("employee-service", r -> r.path("/api/v1/employee/**")
                        .uri("http://localhost:8082")) // Route requests matching /products/** to http://localhost:8082
                .route("orders_route", r -> r.path("/api/v1/document/**")
                        .uri("http://localhost:7070")) // Route requests matching /orders/** to http://localhost:8083
                .route("login-service", r->r.path("/api/**")
                		.uri("lb://login-service"))
                .build();
    }
	
	
//	@Bean
//	public HttpClient httpClient() {
//	    return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
//	}
}
