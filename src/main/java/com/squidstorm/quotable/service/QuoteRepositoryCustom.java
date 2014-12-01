package com.squidstorm.quotable.service;

import com.squidstorm.quotable.domain.Quote;


public interface QuoteRepositoryCustom {
    Quote saveQuote(Quote quote);
}
