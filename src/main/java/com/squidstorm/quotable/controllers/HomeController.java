package com.squidstorm.quotable.controllers;

import com.squidstorm.quotable.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/home")
public class HomeController
{
    @Autowired
    QuoteService quoteService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String weclome(Model model) {
        model.addAttribute("welcome_msg", "Why hellllooooo there");
        model.addAttribute("quotes", quoteService.getAll());
        return "home";
    }
}
