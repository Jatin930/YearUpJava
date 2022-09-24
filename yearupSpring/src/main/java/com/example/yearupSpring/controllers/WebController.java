package com.example.yearupSpring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    String indexPage(Model model){
        return "index";
    }

    @RequestMapping("/login")
    String loginPage(Model model){
        return "login";
    }

}
