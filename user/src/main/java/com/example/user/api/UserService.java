package com.example.user.api;

public interface UserService {

    default String getUser() {
        return "Test User API";
    }

    String getUserStores();

    String getUserProducts();

}
