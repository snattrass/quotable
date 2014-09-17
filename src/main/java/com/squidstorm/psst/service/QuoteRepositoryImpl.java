package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Author;
import com.squidstorm.psst.domain.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class QuoteRepositoryImpl implements QuoteRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    @Transactional
    public Quote saveQuote(Quote quote) {
        if (quote.getAuthor() != null) {
            String authorName = quote.getAuthor().getName();
            Author author = authorRepository.findByName(authorName);

            if (author != null) {   // previously quoted
                quote.setAuthor(author);
                return em.merge(quote);
            }
        }

        em.persist(quote);
        return quote;
    }
}
