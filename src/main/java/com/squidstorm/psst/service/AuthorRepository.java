package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    /**
     * Find the author with the given name. This method will be translated into a query using the
     * {@link javax.persistence.NamedQuery} annotation at the {@link Author} class.
     *
     * @param name
     * @return
     */
    Author findByName(String name);
}
