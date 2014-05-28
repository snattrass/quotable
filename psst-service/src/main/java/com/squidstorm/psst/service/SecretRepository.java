package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Secret;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface SecretRepository extends Repository<Secret, Long> {
    List<Secret> findAll();
}
