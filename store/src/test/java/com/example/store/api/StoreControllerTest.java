package com.example.store.api;

import com.example.test.MockMvcTest;
import org.junit.jupiter.api.Test;
//import com.example.test.MockMvcTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.LinkedMultiValueMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
@AutoConfigureMockMvc
class StoreControllerTest extends MockMvcTest {

    @Test
    void getStore() throws Exception {
        String response = getForObject("/stores", new LinkedMultiValueMap<>(), String.class);
        assertThat(response, equalTo("Test Store API"));
    }
}