package com.example.user.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final StoreServiceProxy storeServiceProxy;
    private final ProductServiceProxy productServiceProxy;

    @Override
    public String getUserStores() {
        return storeServiceProxy.getStore();
    }

    @Override
    public String getUserProducts() {
        String store = storeServiceProxy.getStore();
        if (store != null) {
            return productServiceProxy.getProduct();
        }
        return null;
    }
}
