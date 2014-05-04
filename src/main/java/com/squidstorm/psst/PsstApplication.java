package com.squidstorm.psst;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;


/**
 * Squidstorm Solutions
 * <p/>
 * Create by Simon Nattrass on 04/05/2014 at 11:18
 */
@EnableAutoConfiguration
public class PsstApplication
{
    public static void main (String[] args)
    {
        SpringApplication.run(PsstApplication.class, args);
    }
}
