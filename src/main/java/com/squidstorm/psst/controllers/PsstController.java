package com.squidstorm.psst.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class PsstController
{
    @RequestMapping("quotes")
    public String secrets() {
        return "Here is a list of all quotes";
    }
}
