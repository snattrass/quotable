package com.squidstorm.psst;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;


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
