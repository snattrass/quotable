package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Quote;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService
{
    @Autowired
    private QuoteRepository quoteRepository;

    public List<Quote> getAll() {
        Iterable<Quote> quotes = quoteRepository.findAll();
        return IteratorUtils.toList(quotes.iterator());
    }

    public Quote getQuote(Long id) {
        return quoteRepository.findOne(id);
    }
}
