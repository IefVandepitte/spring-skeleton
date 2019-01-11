/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.HelloService;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
/**
 *
 * @author ief
 */
public class HelloControllerMockTest {
    private HelloController controller;
    private MockMvc mockMvc;
    
    @Mock
    HelloService mock;
    
    public HelloControllerMockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new HelloController();
        mockMvc = standaloneSetup(controller).build();
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testHelloPost() throws Exception{
        String expResult = "Hello testMock!";
        Mockito.when(mock.sayName("test")).thenReturn(expResult);
        //injectie:
        ReflectionTestUtils.setField(controller, "helloService", mock);
        mockMvc.perform(post("/hello")
                .param("value","test"))
                .andExpect(view().name("helloView"))
                .andExpect(model().attributeExists("helloMessage"))
                .andExpect(model().attribute("helloMessage", expResult));
    }
}
