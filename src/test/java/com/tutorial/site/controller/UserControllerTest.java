package com.tutorial.site.controller;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    public void testGetAllUsers() throws Exception{
        MockHttpServletResponse result = mockMvc.perform(get("/users").accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
        result.getContentAsString();
    }
}
