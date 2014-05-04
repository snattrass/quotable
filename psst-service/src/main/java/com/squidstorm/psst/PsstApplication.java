package com.squidstorm.psst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


/**
 * The main entry point for PSST.
 *
 * @author Simon Nattrass
 */
@EnableAutoConfiguration
public class PsstApplication
{
    public static void main (String[] args) throws Exception
    {
        SpringApplication.run(PsstApplication.class, args);
    }
}
