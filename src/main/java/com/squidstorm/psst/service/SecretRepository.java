package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Secret;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SecretRepository extends CrudRepository<Secret, Long> {
}
