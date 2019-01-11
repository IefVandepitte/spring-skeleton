/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ief
 */
@Controller
@RequestMapping("/member/*")
public class MemberController {
    @RequestMapping("add")
    public String addMember(Model model){
       
        return "stub";
    }
    @RequestMapping(value = {"/hello"}, method = RequestMethod.POST )
    public String onSubmit( 
            @RequestParam(
                    value = "username",required = true) String name ,
            Model model){
       
        return "stub";
    }
    @RequestMapping(value = {"remove", "delete"},
            method = RequestMethod.GET)
    public String removeMember(){
        return "stub";
    }
    
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String memberList(Model model){
        Registration registration = new Registration();
        model.addAttribute("registration", registration);
        return "memberForm";
    }
            
}
