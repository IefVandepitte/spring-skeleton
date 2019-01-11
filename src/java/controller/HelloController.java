/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author ief
 */
@Controller

public class HelloController {
    @Autowired
    private HelloService helloService;
    
    @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
    public String showHomepage(Model model){
        model.addAttribute("name", new Name());
        return "nameForm";
    }
    
    @RequestMapping(value = {"/hello"}, method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute Name name, Model model){
        model.addAttribute("helloMessage", helloService.sayName(name.getValue()));
        return "helloView";
    }
    
    
}
