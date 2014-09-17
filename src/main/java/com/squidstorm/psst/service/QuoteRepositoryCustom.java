package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Quote;


public interface QuoteRepositoryCustom {
    Quote saveQuote(Quote quote);
}
