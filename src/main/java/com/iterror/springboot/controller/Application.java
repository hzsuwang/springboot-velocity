package com.iterror.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@SpringBootApplication
@Controller
public class Application {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "name1");

        return "home";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
