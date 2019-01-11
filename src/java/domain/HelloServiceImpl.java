/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ief
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayName(String name) {
       return String.format("Hello %s!",(name != null)?name : "");
    }
    
}
