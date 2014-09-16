package com.squidstorm.psst.controllers;

import com.squidstorm.psst.domain.Quote;
import com.squidstorm.psst.service.QuoteRepository;
import org.apache.commons.collections4.IteratorUtils;
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
    private QuoteRepository quoteRepository;

    @RequestMapping("")
    public List<Quote> getAll() {
        Iterable<Quote> quotes = quoteRepository.findAll();
        return IteratorUtils.toList(quotes.iterator());
    }

    @RequestMapping("/{id}")
    public Quote getOne(@PathVariable Long id) {
        return quoteRepository.findOne(id);
    }
}
