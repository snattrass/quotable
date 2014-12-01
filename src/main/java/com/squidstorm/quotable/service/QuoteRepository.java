package com.squidstorm.quotable.service;

import com.squidstorm.quotable.domain.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long>, QuoteRepositoryCustom {
}
