package com.example.RestAPISecond.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstRestController {
    @GetMapping("/Say")
    public String helloWorld(){
        return "Hello World";
    }
}
