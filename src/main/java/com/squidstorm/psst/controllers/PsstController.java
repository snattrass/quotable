package com.squidstorm.psst.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class PsstController
{
    @RequestMapping("secrets")
    public String secrets() {
        return "Here are all my secrets...";
    }
}
