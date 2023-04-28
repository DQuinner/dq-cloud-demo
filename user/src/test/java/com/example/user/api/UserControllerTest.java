package com.example.user.api;

import com.example.test.MockMvcTest;
import org.junit.jupiter.api.Test;
import org.springframework.util.LinkedMultiValueMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class UserControllerTest extends MockMvcTest {

    @Test
    void getUser() throws Exception {
        String response = getForObject("/users", new LinkedMultiValueMap<>(), String.class);
        assertThat(response, equalTo("Test User API"));
    }
}