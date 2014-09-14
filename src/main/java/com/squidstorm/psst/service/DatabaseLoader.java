package com.squidstorm.psst.service;

import com.squidstorm.psst.domain.Secret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DatabaseLoader
{
    private final SecretRepository secretRepository;

    @Autowired
    public DatabaseLoader(SecretRepository secretRepository)
    {
        this.secretRepository = secretRepository;
    }

    @PostConstruct
    void init()
    {
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
    }
}
