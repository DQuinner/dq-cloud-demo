package com.example.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SpringBootTest
@AutoConfigureMockMvc
public abstract class MockMvcTest {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper;

    protected <T> T getForObject(String url, MultiValueMap<String, String> params, Class<T> cls) throws Exception {
        String content = this.mockMvc.perform(MockMvcRequestBuilders.get(url).params(params))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andReturn()
                .getResponse()
                .getContentAsString(StandardCharsets.UTF_8);

        return readValue(content, cls);
    }

    protected <T> T readValue(String value, Class<T> cls) throws IOException {
        if (String.class.equals(cls)) {
            return cls.cast(value);
        }
        return objectMapper.readValue(value, cls);
    }

}
