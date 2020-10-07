package pers.jay.equality.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
    @RequestMapping("/HelloWorld")
    public String hello(){
    	return "Hello World";
    }
}