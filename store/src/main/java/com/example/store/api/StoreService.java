package com.example.store.api;

public interface StoreService {

    default String getStore() {
        return "Test Store API";
    }

}
