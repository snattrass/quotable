package com.squidstorm.psst.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String weclome(Model model) {
        model.addAttribute("welcome_msg", "Why hellllooooo there");
        return "home";
    }
}
