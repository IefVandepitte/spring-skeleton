/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.WebConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
/**
 *
 * @author ief
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfig.class)
public class HelloControllerTest {
    @Autowired
    private WebApplicationContext wac;
    
    private MockMvc mockMvc;
    
    @Before
    public void before(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    @Test
    public void testHelloGet() throws Exception{
        mockMvc.perform(get("/hello"))
                .andExpect(view().name("nameForm"))
                .andExpect(model().attributeExists("name"));
    }   
}
