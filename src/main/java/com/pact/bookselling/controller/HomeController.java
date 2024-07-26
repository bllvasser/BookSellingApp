package com.pact.bookselling.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @Value("${spring.application.name}") //WHICH IMPORT DO I HAVE TO USE FOR VALUE?
    String appName;

    @GetMapping("/")
    public String homePage(Model model) { //WHICH IMPORT DO I HAVE TO USE FOR MODEL?
        model.addAttribute("appName", appName);
        return "home";
    }
}
