package com.example.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="product-service")
public interface ProductServiceProxy {

    @GetMapping("/products")
    String getProduct();

}
