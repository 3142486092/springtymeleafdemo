package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/first")
    public String indexPage(Model model) {
        System.out.println("测试 ..");
        String message = "Hello, Thymeleaf!";
        model.addAttribute("message", message);
        return "index";
    }
}
