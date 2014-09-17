package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long>, QuoteRepositoryCustom {
}
