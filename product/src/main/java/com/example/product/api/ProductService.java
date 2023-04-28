package com.example.product.api;

public interface ProductService {

    default String getProduct() {
        return "Test Product API";
    }

}
