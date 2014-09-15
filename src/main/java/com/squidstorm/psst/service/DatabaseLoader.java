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
        secretRepository.save(new Secret("Simon", "Alison",
                "One day you and everyone you know will be dust, and nothing you said or did, or bought or promised, " +
                "or saved, or downloaded, or uploaded, or typed, or Tweeted will mean anything, and that day grows " +
                "closer by the second.  Your future self, 40 years down the line, will hate you if you don’t have the " +
                "balls to live now.  On your return you will find a new job, another girlfriend/boyfriend, a bed for " +
                "the night, and all those people who said not to go will be sorry they tried to stop you, and will " +
                "wish they’d had the strength to go too."));

        secretRepository.save(new Secret("Simon", "Alison",
                "One doesn't discover new lands without consenting to lose sight, for a very long time, of the shore."));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
        secretRepository.save(new Secret("Simon", "Alison", "I ate all the chocolate"));
    }
}
