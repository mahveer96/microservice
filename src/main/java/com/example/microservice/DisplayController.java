package com.example.microservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DisplayController {
   

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, defaultValue = "Guest") String param) {
    return "Hello " + param;
    }

     @GetMapping("/")
    public String defalut(@RequestParam(required = false, defaultValue = "Guest") String param) {
    return "Hello " + param;
    }
    
    
}
