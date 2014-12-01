package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Quote;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService
{
    private final QuoteRepository repository;

    @Autowired
    public QuoteService(QuoteRepository repository) {
        this.repository = repository;
    }

    public List<Quote> getAll() {
        Iterable<Quote> quotes = repository.findAll();
        return IteratorUtils.toList(quotes.iterator());
    }

    public Quote getQuote(Long id) {
        return repository.findOne(id);
    }
}
