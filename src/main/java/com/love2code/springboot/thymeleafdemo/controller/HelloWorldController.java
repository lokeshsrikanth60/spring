package com.love2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm() {
        System.out.println("aaaa");
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        System.out.println("hello");
        return "helloworld";
    }
}
