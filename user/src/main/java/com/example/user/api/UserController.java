package com.example.user.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public String getUser() {
        return userService.getUser();
    }

    @GetMapping("/user-stores")
    public String getUserStores() {
        return userService.getUserStores();
    }

    @GetMapping("/user-products")
    public String getUserProducts() {
        return userService.getUserProducts();
    }
}
