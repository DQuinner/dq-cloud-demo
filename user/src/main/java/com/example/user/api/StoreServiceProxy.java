package com.example.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="store-service")
public interface StoreServiceProxy {
    @GetMapping("/stores")
    String getStore();
}
