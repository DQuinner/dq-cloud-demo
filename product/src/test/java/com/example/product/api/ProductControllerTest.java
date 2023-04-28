package com.example.product.api;

import com.example.test.MockMvcTest;
import org.junit.jupiter.api.Test;
import org.springframework.util.LinkedMultiValueMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class ProductControllerTest extends MockMvcTest {

    @Test
    void getProduct() throws Exception {
        String response = getForObject("/products", new LinkedMultiValueMap<>(), String.class);
        assertThat(response, equalTo("Test Product API"));
    }
}