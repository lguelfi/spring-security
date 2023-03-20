package com.leonardo.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    
    @RequestMapping("/")
    public String showHome() {
        return "home";
    }

    @RequestMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }

    @RequestMapping("/systems")
    public String showSystems() {
        return "systems";
    }
    
}
