package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/users")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("lb://user-service/users"))
                .route(p -> p
                        .path("/user-products")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("lb://user-service/user-products"))
                .route(p -> p
                        .path("/user-stores")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("lb://user-service/user-stores"))
                .route(p -> p
                        .path("/stores")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("lb://store-service/stores"))
                .route(p -> p
                        .path("/products")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("lb://product-service/products"))
                .build();
    }



}
