package com.love2code.springboot.thymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel){
       System.out.println("hello");
    theModel.addAttribute("theDate",java.time.LocalDateTime.now());
        return "helloworld";
    }
}
