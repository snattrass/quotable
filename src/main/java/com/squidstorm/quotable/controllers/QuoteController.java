package com.squidstorm.quotable.controllers;

import com.squidstorm.quotable.domain.Quote;
import com.squidstorm.quotable.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/quotes")
public class QuoteController
{
    @Autowired
    private QuoteService quoteService;

    @RequestMapping("")
    public List<Quote> getAll() {
        return quoteService.getAll();
    }

    @RequestMapping("/{id}")
    public Quote getOne(@PathVariable Long id) {
        return quoteService.getQuote(id);
    }
}
